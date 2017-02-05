/**
 * Knetik Platform API Documentation latest 
 * No descripton provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: latest 
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.FlagReportResource;
import io.swagger.client.model.PageFlagReportResource;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MediaModerationApi
 */
public class MediaModerationApiTest {

    private final MediaModerationApi api = new MediaModerationApi();

    
    /**
     * Get a flag report
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFlagReportUsingGETTest() throws ApiException {
        Long id = null;
        // api.getFlagReportUsingGET(id);

        // TODO: test validations
    }
    
    /**
     * Returns a page of flag reports
     *
     * Context can be either a free-form string or a pre-defined context name
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFlagsReportUsingGETTest() throws ApiException {
        Boolean excludeResolved = null;
        String filterContext = null;
        Integer size = null;
        Integer page = null;
        // PageFlagReportResource response = api.getFlagsReportUsingGET(excludeResolved, filterContext, size, page);

        // TODO: test validations
    }
    
    /**
     * Update a flag report
     *
     * Lets you set the resolution of a report. Resolution types is {banned,ignore} in case of &#39;banned&#39; you will need to pass the reason.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setFlagResolutionUsingPUTTest() throws ApiException {
        Long id = null;
        FlagReportResource flagReportResource = null;
        // api.setFlagResolutionUsingPUT(id, flagReportResource);

        // TODO: test validations
    }
    
}
