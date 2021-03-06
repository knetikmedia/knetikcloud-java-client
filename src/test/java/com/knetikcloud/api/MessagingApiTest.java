/*
 * Knetik Platform API Documentation latest 
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://knetikcloud.com.
 *
 * OpenAPI spec version: latest 
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.knetikcloud.api;

import com.knetikcloud.client.ApiException;
import com.knetikcloud.model.MessageResource;
import com.knetikcloud.model.MessageTemplateBulkRequest;
import com.knetikcloud.model.MessageTemplateResource;
import com.knetikcloud.model.PageResourceMessageTemplateResource;
import com.knetikcloud.model.RawEmailResource;
import com.knetikcloud.model.RawPushResource;
import com.knetikcloud.model.RawSMSResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.TemplateEmailResource;
import com.knetikcloud.model.TemplatePushResource;
import com.knetikcloud.model.TemplateSMSResource;
import com.knetikcloud.model.WebsocketMessageResource;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MessagingApi
 */
@Ignore
public class MessagingApiTest {

    private final MessagingApi api = new MessagingApi();

    
    /**
     * Compile a message template
     *
     * Processes a set of input data against the template and returnes the compiled result. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; MESSAGING_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void compileMessageTemplateTest() throws ApiException {
        MessageTemplateBulkRequest request = null;
        Map<String, String> response = api.compileMessageTemplate(request);

        // TODO: test validations
    }
    
    /**
     * Create a message template
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; MESSAGING_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createMessageTemplateTest() throws ApiException {
        MessageTemplateResource messageTemplate = null;
        MessageTemplateResource response = api.createMessageTemplate(messageTemplate);

        // TODO: test validations
    }
    
    /**
     * Delete an existing message template
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; MESSAGING_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteMessageTemplateTest() throws ApiException {
        String id = null;
        api.deleteMessageTemplate(id);

        // TODO: test validations
    }
    
    /**
     * Get a single message template
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; MESSAGING_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMessageTemplateTest() throws ApiException {
        String id = null;
        MessageTemplateResource response = api.getMessageTemplate(id);

        // TODO: test validations
    }
    
    /**
     * List and search message templates
     *
     * Get a list of message templates with optional filtering. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; MESSAGING_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMessageTemplatesTest() throws ApiException {
        String filterTagset = null;
        String filterTagIntersection = null;
        String filterTagExclusion = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        PageResourceMessageTemplateResource response = api.getMessageTemplates(filterTagset, filterTagIntersection, filterTagExclusion, size, page, order);

        // TODO: test validations
    }
    
    /**
     * Send a message
     *
     * Sends a message with one or more formats to one or more users. Fill in any message formats desired (email, sms, websockets) and each user will recieve all valid formats. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; MESSAGING_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sendMessageTest() throws ApiException {
        MessageResource messageResource = null;
        api.sendMessage(messageResource);

        // TODO: test validations
    }
    
    /**
     * Send a raw email to one or more users
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; MESSAGING_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sendRawEmailTest() throws ApiException {
        RawEmailResource rawEmailResource = null;
        api.sendRawEmail(rawEmailResource);

        // TODO: test validations
    }
    
    /**
     * Send a raw push notification
     *
     * Sends a raw push notification message to one or more users. User&#39;s without registered mobile device for the application will be skipped. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; MESSAGING_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sendRawPushTest() throws ApiException {
        RawPushResource rawPushResource = null;
        api.sendRawPush(rawPushResource);

        // TODO: test validations
    }
    
    /**
     * Send a raw SMS
     *
     * Sends a raw SMS text message to one or more users. User&#39;s without registered mobile numbers will be skipped. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; MESSAGING_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sendRawSMSTest() throws ApiException {
        RawSMSResource rawSMSResource = null;
        api.sendRawSMS(rawSMSResource);

        // TODO: test validations
    }
    
    /**
     * Send a templated email to one or more users
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; MESSAGING_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sendTemplatedEmailTest() throws ApiException {
        TemplateEmailResource messageResource = null;
        api.sendTemplatedEmail(messageResource);

        // TODO: test validations
    }
    
    /**
     * Send a templated push notification
     *
     * Sends a templated push notification message to one or more users. User&#39;s without registered mobile device for the application will be skipped. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; MESSAGING_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sendTemplatedPushTest() throws ApiException {
        TemplatePushResource templatePushResource = null;
        api.sendTemplatedPush(templatePushResource);

        // TODO: test validations
    }
    
    /**
     * Send a new templated SMS
     *
     * Sends a templated SMS text message to one or more users. User&#39;s without registered mobile numbers will be skipped. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; MESSAGING_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sendTemplatedSMSTest() throws ApiException {
        TemplateSMSResource templateSMSResource = null;
        api.sendTemplatedSMS(templateSMSResource);

        // TODO: test validations
    }
    
    /**
     * Send a websocket message
     *
     * Sends a websocket message to one or more users. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; MESSAGING_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sendWebsocketTest() throws ApiException {
        WebsocketMessageResource websocketResource = null;
        api.sendWebsocket(websocketResource);

        // TODO: test validations
    }
    
    /**
     * Update an existing message template
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; MESSAGING_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateMessageTemplateTest() throws ApiException {
        String id = null;
        MessageTemplateResource messageTemplateResource = null;
        MessageTemplateResource response = api.updateMessageTemplate(id, messageTemplateResource);

        // TODO: test validations
    }
    
}
