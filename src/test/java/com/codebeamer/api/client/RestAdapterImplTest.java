package com.codebeamer.api.client;

import org.apache.http.auth.InvalidCredentialsException;
import org.apache.http.conn.ConnectTimeoutException;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class RestAdapterImplTest {
    @Test
    public void testGetVersion_withCorrectEndpoint_withCorrectCredentials() throws Exception {
        RestAdapter rest = getRestAdapterWithCorrectEndpointAndCredentials();
        assertEquals(rest.getVersion(), "\"8.3.0\"");
    }

    @Test(expectedExceptions = ConnectTimeoutException.class)
    public void testGetVersion_withIncorrectEndpoint_shouldThrowException() throws Exception {
        RestAdapter rest = getRestAdapterWithIncorrectEndpoint();
        rest.getVersion();
    }

    @Test(expectedExceptions = InvalidCredentialsException.class)
    public void testGetVersion_withCorrectEndpoint_WithIncorrectCredentials() throws Exception {
        RestAdapter rest = getRestAdapterWithCorrectEndpointAndIncorrectCredentials();
        rest.getVersion();
    }

    private RestAdapter getRestAdapterWithCorrectEndpointAndCredentials() {
        Configuration config = new Configuration("http://10.200.10.1:8080/cb", "bond", "007");
        return new RestAdapterImpl(config);
    }

    private RestAdapter getRestAdapterWithCorrectEndpointAndIncorrectCredentials() {
        Configuration config = new Configuration("http://10.200.10.1:8080/cb", "bond", "invalid");
        return new RestAdapterImpl(config);
    }

    private RestAdapter getRestAdapterWithIncorrectEndpoint() {
        Configuration config = new Configuration("http://0.0.0.0:10000", "bond", "007");
        return new RestAdapterImpl(config);
    }
}
