/*
 * Copyright 2007 Alin Dreghiciu.
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
package org.ops4j.pax.url.wrap.internal;

import org.ops4j.lang.NullArgumentException;
import org.ops4j.pax.url.wrap.ServiceConstants;
import org.ops4j.util.property.PropertyResolver;
import org.ops4j.util.property.PropertyStore;

/**
 * Service Configuration implementation.
 *
 * @author Alin Dreghiciu
 * @see Configuration
 * @since September 09, 2007
 */
public class ConfigurationImpl
    extends PropertyStore
    implements Configuration
{

    /**
     * Property resolver. Cannot be null.
     */
    private final PropertyResolver m_propertyResolver;

    /**
     * Creates a new service configuration.
     *
     * @param propertyResolver propertyResolver used to resolve properties; mandatory
     */
    public ConfigurationImpl( final PropertyResolver propertyResolver )
    {
        NullArgumentException.validateNotNull( propertyResolver, "Property resolver" );
        m_propertyResolver = propertyResolver;
    }

    /**
     * @see Configuration#getCertificateCheck()
     */
    public Boolean getCertificateCheck()
    {
        if( !contains( ServiceConstants.PROPERTY_CERTIFICATE_CHECK ) )
        {
            return set( ServiceConstants.PROPERTY_CERTIFICATE_CHECK,
                        Boolean.valueOf( m_propertyResolver.get( ServiceConstants.PROPERTY_CERTIFICATE_CHECK ) )
            );
        }
        return get( ServiceConstants.PROPERTY_CERTIFICATE_CHECK );
    }

}
