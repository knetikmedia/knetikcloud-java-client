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
import io.swagger.client.model.Expressionobject;
import io.swagger.client.model.BreRule;
import io.swagger.client.model.BooleanResource;
import io.swagger.client.model.PageBreRule;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BRERuleEngineRulesApi
 */
public class BRERuleEngineRulesApiTest {

    private final BRERuleEngineRulesApi api = new BRERuleEngineRulesApi();

    
    /**
     * Returns a string representation of the provided expression
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void convertExpressionToStringUsingPOSTTest() throws ApiException {
        Expressionobject expression = null;
        // String response = api.convertExpressionToStringUsingPOST(expression);

        // TODO: test validations
    }
    
    /**
     * Create a rule
     *
     * Rules define which actions to run when a given event verifies the specified conditions. Conditions and actions are defined by binding event or context parameters to arguments. Conditions also known as Predicates are logical expressions that result in a boolean. Operators are used to describe rules between arguments to form that condition. There are 3 families of operators: Boolean, Math and String. Math and String operators are functions that transform arguments into numbers or strings...&lt;h1&gt;Boolean Operators&lt;/h1&gt;&lt;br /&gt;&lt;br /&gt;1 arg:&lt;br /&gt;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&lt;br /&gt;&lt;br /&gt;&lt;ul&gt; &lt;li&gt;IS_NULL&lt;/li&gt; &lt;li&gt;IS_NOT_NULL&lt;/li&gt; &lt;li&gt;STRING_IS_EMPTY&lt;/li&gt; &lt;li&gt;NOT &lt;/li&gt; &lt;li&gt;MAP_IS_EMPTY&lt;/li&gt;&lt;/ul&gt;&lt;br /&gt;2 args:&lt;br /&gt;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&lt;br /&gt;&lt;br /&gt;&lt;ul&gt; &lt;li&gt;EQ&lt;/li&gt; &lt;li&gt;NE (Not Equals)&lt;/li&gt; &lt;li&gt;GT (Greater Than)&lt;/li&gt; &lt;li&gt;GOE (Greater Or Equals)&lt;/li&gt; &lt;li&gt;LT (Lesser Than)&lt;/li&gt; &lt;li&gt;LOE (Lesser Or Equals)&lt;/li&gt; &lt;li&gt;OR&lt;/li&gt; &lt;li&gt;AND&lt;/li&gt; &lt;li&gt;XNOR&lt;/li&gt; &lt;li&gt;XOR&lt;/li&gt; &lt;li&gt;CONTAINS_KEY (for maps only)&lt;/li&gt; &lt;li&gt;CONTAINS_VALUE (for maps only)&lt;/li&gt; &lt;li&gt;MATCHES (regex)&lt;/li&gt; &lt;li&gt;MATCHES_IC (regex ignore case)&lt;/li&gt; &lt;li&gt;STARTS_WITH&lt;/li&gt; &lt;li&gt;STARTS_WITH_IC&lt;/li&gt; &lt;li&gt;EQ_IGNORE_CASE&lt;/li&gt; &lt;li&gt;ENDS_WITH&lt;/li&gt; &lt;li&gt;ENDS_WITH_IC&lt;/li&gt; &lt;li&gt;STRING_CONTAINS&lt;/li&gt; &lt;li&gt;STRING_CONTAINS_IC&lt;/li&gt; &lt;li&gt;LIKE (SQL like)&lt;/li&gt;&lt;/ul&gt;&lt;br /&gt;3 args exceptions:&lt;br /&gt;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&lt;br /&gt;&lt;br /&gt;&lt;ul&gt; &lt;li&gt;BETWEEN&lt;/li&gt;&lt;/ul&gt;&lt;br /&gt;n args:&lt;br /&gt;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&lt;br /&gt;&lt;br /&gt;&lt;ul&gt; &lt;li&gt;IN&lt;/li&gt; &lt;li&gt;NOT_INT&lt;/li&gt;&lt;/ul&gt;&lt;h1&gt;Math Operators&lt;/h1&gt;1 arg:&lt;br /&gt;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&lt;br /&gt;&lt;br /&gt;&lt;ul&gt; &lt;li&gt;NEGATE&lt;/li&gt; &lt;li&gt;MAP_SIZE&lt;/li&gt; &lt;li&gt;STRING_LENGTH&lt;/li&gt; &lt;li&gt;CEIL&lt;/li&gt; &lt;li&gt;ABS&lt;/li&gt; &lt;li&gt;FLOOR&lt;/li&gt; &lt;li&gt;ROUND&lt;/li&gt; &lt;li&gt;RANDOM (no arg)&lt;/li&gt; &lt;li&gt;RANDOM2 (seed arg)&lt;/li&gt; &lt;li&gt;NUMCAST&lt;/li&gt; &lt;li&gt;HOUR&lt;/li&gt; &lt;li&gt;MINUTE&lt;/li&gt; &lt;li&gt;SECOND&lt;/li&gt; &lt;li&gt;MILLISECOND&lt;/li&gt; &lt;li&gt;YEAR&lt;/li&gt; &lt;li&gt;WEEK&lt;/li&gt; &lt;li&gt;YEAR_MONTH&lt;/li&gt; &lt;li&gt;YEAR_WEEK&lt;/li&gt; &lt;li&gt;DAY_OF_WEEK&lt;/li&gt; &lt;li&gt;DAY_OF_MONTH&lt;/li&gt; &lt;li&gt;DAY_OF_YEAR&lt;/li&gt; &lt;li&gt;WEEK&lt;/li&gt; &lt;li&gt;WEEK&lt;/li&gt; &lt;li&gt;WEEK&lt;/li&gt;&lt;/ul&gt;&lt;br /&gt;&lt;br /&gt;2 args:&lt;br /&gt;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&lt;br /&gt;&lt;br /&gt;&lt;ul&gt; &lt;li&gt;ADD&lt;/li&gt; &lt;li&gt;DIV&lt;/li&gt; &lt;li&gt;MULT&lt;/li&gt; &lt;li&gt;SUB&lt;/li&gt; &lt;li&gt;POWER&lt;/li&gt; &lt;li&gt;MOD&lt;/li&gt; &lt;li&gt;LOCATE (index of (string, char))&lt;/li&gt; &lt;li&gt;DIFF_YEARS&lt;/li&gt; &lt;li&gt;DIFF_MONTHS&lt;/li&gt; &lt;li&gt;DIFF_WEEKS&lt;/li&gt; &lt;li&gt;DIFF_DAYS&lt;/li&gt; &lt;li&gt;DIFF_HOURS&lt;/li&gt; &lt;li&gt;DIFF_MINUTES&lt;/li&gt; &lt;li&gt;DIFF_SECONDS&lt;/li&gt;&lt;/ul&gt;&lt;br /&gt;&lt;br /&gt;2 args:&lt;br /&gt;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&lt;br /&gt;&lt;br /&gt;&lt;ul&gt; &lt;li&gt;MIN&lt;/li&gt; &lt;li&gt;MAX&lt;/li&gt;&lt;/ul&gt;&lt;h1&gt;String Operators&lt;/h1&gt;0 arg:&lt;br /&gt;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&lt;br /&gt;&lt;br /&gt;&lt;ul&gt; &lt;li&gt;CURRENT_TIME&lt;/li&gt;&lt;/ul&gt;&lt;br /&gt;&lt;br /&gt;1 arg:&lt;br /&gt;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&lt;br /&gt;&lt;br /&gt;&lt;ul&gt; &lt;li&gt;CURRENT_TIME&lt;/li&gt; &lt;li&gt;LOWER&lt;/li&gt; &lt;li&gt;UPPER&lt;/li&gt; &lt;li&gt;TRIM&lt;/li&gt; &lt;li&gt;STRING_CAST&lt;/li&gt;&lt;/ul&gt;&lt;br /&gt;&lt;br /&gt;2 args:&lt;br /&gt;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&lt;br /&gt;&lt;br /&gt;&lt;ul&gt; &lt;li&gt;CHAR_AT&lt;/li&gt; &lt;li&gt;SUBSTR_1ARG (substr(string, start))&lt;/li&gt; &lt;li&gt;CONCAT&lt;/li&gt; &lt;li&gt;TRIM&lt;/li&gt; &lt;li&gt;STRING_CAST&lt;/li&gt;&lt;/ul&gt;&lt;br /&gt;&lt;br /&gt;3 args:&lt;br /&gt;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&lt;br /&gt;&lt;br /&gt;&lt;ul&gt; &lt;li&gt;SUBSTR_2ARGS (substr(string, start, length))&lt;/li&gt;&lt;/ul&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createRuleUsingPOSTTest() throws ApiException {
        BreRule breRule = null;
        // BreRule response = api.createRuleUsingPOST(breRule);

        // TODO: test validations
    }
    
    /**
     * Delete a rule
     *
     * May fail if there are existing rules against it. Cannot delete core rules
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteRuleUsingDELETETest() throws ApiException {
        String id = null;
        // api.deleteRuleUsingDELETE(id);

        // TODO: test validations
    }
    
    /**
     * Enable or disable a rule
     *
     * This is helpful for turning off systems rules which cannot be deleted or modified otherwise
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void enableRuleUsingPUTTest() throws ApiException {
        String id = null;
        BooleanResource enabled = null;
        // api.enableRuleUsingPUT(id, enabled);

        // TODO: test validations
    }
    
    /**
     * Get a single rule
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRuleUsingGETTest() throws ApiException {
        String id = null;
        // BreRule response = api.getRuleUsingGET(id);

        // TODO: test validations
    }
    
    /**
     * List rules
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRulesUsingGETTest() throws ApiException {
        String filterName = null;
        Boolean filterEnabled = null;
        Boolean filterSystem = null;
        String filterTrigger = null;
        String filterAction = null;
        String filterCondition = null;
        Integer size = null;
        Integer page = null;
        // PageBreRule response = api.getRulesUsingGET(filterName, filterEnabled, filterSystem, filterTrigger, filterAction, filterCondition, size, page);

        // TODO: test validations
    }
    
    /**
     * Update a rule
     *
     * Cannot update system rules
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateRuleUsingPUTTest() throws ApiException {
        String id = null;
        BreRule breRule = null;
        // api.updateRuleUsingPUT(id, breRule);

        // TODO: test validations
    }
    
}
