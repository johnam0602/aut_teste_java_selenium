package com.aliexpress.steps;

import br.com.buscape.util.Browser;
import org.junit.After;
import org.junit.Before;

public class BaseSteps extends Browser {

    @Before
    public void iniciarBrowser(){
        browserUp("https://aliexpress.com");
    }

    @After
    public void finalizarBrowser(){
        browserDown();
    }

}