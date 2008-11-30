/*
 * ========================================================================
 *
 * Copyright 2006 Vincent Massol.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * ========================================================================
 */
package org.codehaus.cargo.util;

import junit.framework.TestCase;

/**
 * Unit tests for {@link DefaultFileHandler}.
 * 
 * @version $Id: $
 */
public class DefaultFileHandlerTest extends TestCase
{

    private FileHandler fileHandler;

    protected void setUp() throws Exception
    {
        super.setUp();
        this.fileHandler = new DefaultFileHandler();
    }

    public void testGetAbsolutePathFromRelative()
    {
        String path = this.fileHandler.getAbsolutePath("path");
        assertEquals(path, System.getProperty("user.dir") + System.getProperty("file.separator")
            + "path");
    }

    public void testGetAbsolutePathFromExplicit()
    {
        String path =
            this.fileHandler.getAbsolutePath(System.getProperty("file.separator") + "path");
        assertEquals(path, System.getProperty("file.separator") + "path");
    }

}
