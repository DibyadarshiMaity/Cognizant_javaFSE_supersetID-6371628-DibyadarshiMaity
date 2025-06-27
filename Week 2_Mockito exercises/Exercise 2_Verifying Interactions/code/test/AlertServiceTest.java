package com.example;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

public class AlertServiceTest {

    @Test
    public void testMethodCallOrder() {
        // Step 1: Create mock
        NotificationService mockNotifier = mock(NotificationService.class);

        // Step 2: Inject into AlertService
        AlertService alertService = new AlertService(mockNotifier);
        alertService.alertUser();

        // Step 3: Verify call order
        InOrder inOrder = inOrder(mockNotifier);
        inOrder.verify(mockNotifier).sendEmail();
        inOrder.verify(mockNotifier).sendSMS();
        inOrder.verify(mockNotifier).sendPushNotification();
    }
}
