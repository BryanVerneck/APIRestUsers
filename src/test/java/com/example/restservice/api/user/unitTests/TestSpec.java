package com.example.restservice.api.user.unitTests;

import org.hibernate.service.spi.ServiceException;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.assertj.core.api.Assertions.*;

public class TestSpec {

    @Mock
    Object dep;
    @InjectMocks
    Object service;
    String output;
    Exception exception;

    public TestSpec() {
        MockitoAnnotations.initMocks(this);
    }

    public TestSpec then_output_valid() {
        assertThat(output)
                .isNotNull()
                .isNotBlank()
                .contains("1")
                .containsOnlyDigits()
                .isNotIn("2", "3");
        return this;
    }

    public TestSpec given_() {
        BDDMockito.given(service.toString())
                .willReturn("1");
        return this;
    }

    public TestSpec then_exception_has_message_(String message) {
        assertThat(exception)
                .isInstanceOf(ServiceException.class)
                .hasMessage(message);
        return this;
    }

    public TestSpec then_() {
        return this;
    }

    public TestSpec then_exception_thrown() {
        assertThat(exception).isNotNull();
        return this;
    }

    public TestSpec then_exception_notThrown() throws Exception {
        if (exception != null) {
            throw exception;
        }
        return this;
    }

    public TestSpec when_() {
        try {
            output = service.toString();
        } catch (Exception e) {
            this.exception = e;
        }
        return this;
    }

    public Object given_resquestId_(Object obj) {
        BDDMockito.given(obj)
                .willReturn(null);
        return this;
    }

}

