/*
 * Copyright 2008 Alin Dreghiciu.
 *
 * Licensed  under the  Apache License,  Version 2.0  (the "License");
 * you may not use  this file  except in  compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed  under the  License is distributed on an "AS IS" BASIS,
 * WITHOUT  WARRANTIES OR CONDITIONS  OF ANY KIND, either  express  or
 * implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package prg.ops4j.pax.url.webbundle;

import java.io.IOException;
import java.net.URL;
import org.junit.Test;
import org.ops4j.pax.url.war.Handler;

/**
 * Unit test for {@link org.ops4j.pax.url.webbundle.Handler}.
 *
 * @author Alin Dreghiciu
 * @since 1.0.0, June 16, 2009
 */
public class HandlerTest
{

    /**
     * Protocol handler can be used.
     *
     * @throws java.io.IOException - Unexpected
     */
    @Test
    public void use()
        throws IOException
    {
        System.setProperty( "java.protocol.handler.pkgs", "org.ops4j.pax.url" );
        new URL( "webbundle:file:foo.war" );
    }

}