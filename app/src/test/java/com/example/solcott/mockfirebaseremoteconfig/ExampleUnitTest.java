package com.example.solcott.mockfirebaseremoteconfig;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

@RunWith(MockitoJUnitRunner.class)
public class ExampleUnitTest {

    @Mock
    private FirebaseRemoteConfig remoteConfig;
    @Test
    public void addition_isCorrect() throws Exception {
        Mockito.when(remoteConfig.getBoolean("test")).thenReturn(true);
        remoteConfig.getBoolean("test");
    }
}