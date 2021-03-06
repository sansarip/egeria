/* SPDX-License-Identifier: Apache-2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
package org.odpi.openmetadata.accessservices.assetconsumer.ffdc.exceptions;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;


/**
 * Validate that the new instance exception is properly populated and supports toString, hashCode and equals.
 */
public class NewInstanceExceptionTest
{
    private int       reportedHTTPCode           = 404;
    private String    reportingClassName         = "TestClassName";
    private String    reportingActionDescription = "TestActionDescription";
    private String    reportedErrorMessage       = "TestErrorMessage";
    private String    reportedSystemAction       = "TestSystemAction";
    private String    reportedUserAction         = "TestUserAction";
    private Throwable reportedCaughtException    = new Exception("TestReportedCaughtException");

    /**
     * Constructor
     */
    public NewInstanceExceptionTest()
    {
    }


    /**
     * Test that a new exception is properly populated
     */
    @Test public void testNewException()
    {
        NewInstanceException exception = new NewInstanceException(reportedHTTPCode,
                                                                        reportingClassName,
                                                                        reportingActionDescription,
                                                                        reportedErrorMessage,
                                                                        reportedSystemAction,
                                                                        reportedUserAction);

        assertTrue(exception.getReportedHTTPCode() == reportedHTTPCode);
        assertTrue(exception.getReportingClassName().equals(reportingClassName));
        assertTrue(exception.getReportingActionDescription().equals(reportingActionDescription));
        assertTrue(exception.getErrorMessage().equals(reportedErrorMessage));
        assertTrue(exception.getReportedSystemAction().equals(reportedSystemAction));
        assertTrue(exception.getReportedUserAction().equals(reportedUserAction));
        assertTrue(exception.getReportedCaughtException() == null);
    }


    /**
     * Test that a caught exception is properly wrapped
     */
    @Test public void testWrappingException()
    {
        NewInstanceException exception = new NewInstanceException(reportedHTTPCode,
                                                                        reportingClassName,
                                                                        reportingActionDescription,
                                                                        reportedErrorMessage,
                                                                        reportedSystemAction,
                                                                        reportedUserAction,
                                                                        reportedCaughtException);

        assertTrue(exception.getReportedHTTPCode() == reportedHTTPCode);
        assertTrue(exception.getReportingClassName().equals(reportingClassName));
        assertTrue(exception.getReportingActionDescription().equals(reportingActionDescription));
        assertTrue(exception.getErrorMessage().equals(reportedErrorMessage));
        assertTrue(exception.getReportedSystemAction().equals(reportedSystemAction));
        assertTrue(exception.getReportedUserAction().equals(reportedUserAction));
        assertFalse(exception.getReportedCaughtException().equals(null));
        assertTrue(exception.getReportedCaughtException().getMessage().equals("TestReportedCaughtException"));
    }


    /**
     * Validate that string, equals and hashCode work off of the values of the exception
     */
    @Test public void testHashCode()
    {
        NewInstanceException exception = new NewInstanceException(reportedHTTPCode,
                                                                        reportingClassName,
                                                                        reportingActionDescription,
                                                                        reportedErrorMessage,
                                                                        reportedSystemAction,
                                                                        reportedUserAction);

        NewInstanceException exception2 = new NewInstanceException(reportedHTTPCode,
                                                                         reportingClassName,
                                                                         reportingActionDescription,
                                                                         reportedErrorMessage,
                                                                         reportedSystemAction,
                                                                         reportedUserAction,
                                                                         reportedCaughtException);

        NewInstanceException exception3 = new NewInstanceException(reportedHTTPCode,
                                                                         reportingClassName,
                                                                         reportingActionDescription,
                                                                         reportedErrorMessage,
                                                                         reportedSystemAction,
                                                                         reportedUserAction,
                                                                         reportedCaughtException);


        assertTrue(exception.hashCode() == exception.hashCode());
        assertFalse(exception.hashCode() == exception2.hashCode());

        assertTrue(exception.equals(exception));
        assertFalse(exception.equals(reportedCaughtException));
        assertFalse(exception.equals(exception2));
        assertTrue(exception2.equals(exception3));

        assertTrue(exception.toString().contains("NewInstanceException"));

        assertTrue(exception.toString().equals(exception.toString()));
        assertFalse(exception.toString().equals(exception2.toString()));
    }
}
