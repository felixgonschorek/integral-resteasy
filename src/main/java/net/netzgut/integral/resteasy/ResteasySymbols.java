/**
 * Copyright 2017 Netzgut GmbH <info@netzgut.net>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.netzgut.integral.resteasy;

// Original project:    Tapestry-Resteasy https://github.com/tynamo/tapestry-resteasy
// Original module:     tapestry-resteasy
// Original file:       org.tynamo.resteasy.ResteasySymbols

import org.jboss.resteasy.plugins.server.servlet.ResteasyContextParameters;

public class ResteasySymbols {

    /**
     * Maps the Resteasy servlet to an url prefix. We are re-using the constant form RestEasy
     * to prevent typos.
     */
    public static final String MAPPING_PREFIX        = ResteasyContextParameters.RESTEASY_SERVLET_MAPPING_PREFIX;

    /**
     * If "true", then the InternalConstants.TAPESTRY_APP_PACKAGE_PARAM + ResteasySymbols.AUTOSCAN_PACKAGE_NAME
     * package will be added to the ResteasyPackageManager so that it will be scanned for annotated REST resource classes.
     */
    public static final String AUTOSCAN              = "integral.resteasy.autoscan";

    /**
     * Name of the package to include in ResteasyPackageManager for AUTOSCAN. Do not include the dot,
     * e.g. "rest" instea of ".rest".
     */
    public static final String AUTOSCAN_PACKAGE_NAME = "integral.resteasy.autoscan-package-name";

    /**
     * Add the CORS authorization to the header.
     */
    public static final String CORS_ENABLED          = "integral.resteasy.cors-enabled";

    /**
     * Adds version infos to the headers according to the annotation {@link net.netzgut.integral.reasteasy.annotations.Version}.
     */
    public static final String VERSIONING_ENABLED    = "integral.resteasy.versioning-enabled";
}
