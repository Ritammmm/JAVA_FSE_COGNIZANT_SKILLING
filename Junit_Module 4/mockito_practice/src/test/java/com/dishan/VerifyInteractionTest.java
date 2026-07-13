package com.dishan;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class VerifyInteractionTest {

    @Test
    public void shouldVerifyExternalApiInteraction() {

        // Arrange
        ExternalApi mockApi = mock(ExternalApi.class);
        MyService myService = new MyService(mockApi);

        // Act
        myService.fetchData();

        // Assert
        verify(mockApi).getData();
    }
}