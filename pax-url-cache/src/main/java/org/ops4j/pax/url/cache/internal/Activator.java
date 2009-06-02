/*
 * Copyright 2009 Alin Dreghiciu.
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
package org.ops4j.pax.url.cache.internal;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import org.osgi.framework.BundleContext;
import org.ops4j.pax.url.cache.ServiceConstants;
import org.ops4j.pax.url.commons.handler.ConnectionFactory;
import org.ops4j.pax.url.commons.handler.HandlerActivator;
import org.ops4j.util.property.PropertyResolver;

/**
 * Bundle activator for "cache:" protocol handler.
 *
 * @author Alin Dreghiciu
 * @since 0.6.0, June 02, 2009
 */
public final class Activator
    extends HandlerActivator<Void>
{

    /**
     * @see HandlerActivator#HandlerActivator(String[], String, ConnectionFactory)
     */
    public Activator()
    {
        super(
            new String[]{ ServiceConstants.PROTOCOL },
            ServiceConstants.PID,
            new ConnectionFactory<Void>()
            {

                /**
                 * Creates a "cache" url connection.
                 *
                 * @see ConnectionFactory#createConection(BundleContext, java.net.URL, Object)
                 */
                public URLConnection createConection( final BundleContext bundleContext,
                                                      final URL url,
                                                      final Void notUsed )
                    throws IOException
                {
                    return createConnection( url );
                }

                /**
                 * @see ConnectionFactory#createConfiguration(PropertyResolver)
                 */
                public Void createConfiguration( final PropertyResolver propertyResolver )
                {
                    return null;
                }

            }
        );
    }

    /**
     * Creates a "cache" url connection.
     *
     * @param url cache file url
     *
     * @return url connection
     */
    public static URLConnection createConnection( final URL url )
    {
        throw new UnsupportedOperationException( "Not yet implemented" );
    }

}