package org.techfrog.restprotocolbuffers;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.context.annotation.Import;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.web.client.RestTemplate;
import org.techfrog.restprotocolbuffers.model.Course;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = Application.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Import(RestTemplateConfiguration.class)
class CourseControllerTest {

    private static final String COURSE_1_URL = "http://localhost:%d/courses/1";

    @LocalServerPort
    int port;

    @Autowired
    private RestTemplate restTemplate;

    @Test
    public void whenUsingRestTemplate_thenSucceed() {
        ResponseEntity<Course> course = restTemplate.getForEntity(String.format(COURSE_1_URL, port), Course.class);
        assertResponse(course.toString());
    }

    private void assertResponse(String response) {
        assertThat(response, containsString("id"));
        assertThat(response, containsString("course_name"));
        assertThat(response, containsString("Protocol Buffer"));
        assertThat(response, containsString("first_name"));
        assertThat(response, containsString("John"));
    }
}