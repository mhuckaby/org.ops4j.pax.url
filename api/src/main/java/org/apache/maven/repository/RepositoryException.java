package org.apache.maven.repository;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

/**
 * @author Benjamin Bentmann
 */
public abstract class RepositoryException
    extends Exception
{

    public RepositoryException( String message )
    {
        super( message );
    }

    public RepositoryException( String message, Throwable cause )
    {
        super( message, cause );
    }

    static String getMessage( Throwable cause )
    {
        String msg = "";
        if ( cause != null )
        {
            msg = cause.getMessage();
            if ( msg == null || msg.length() <= 0 )
            {
                msg = cause.getClass().getSimpleName();
            }
        }
        return msg;
    }

}
