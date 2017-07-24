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
import com.knetikcloud.model.GroupMemberResource;
import com.knetikcloud.model.GroupResource;
import com.knetikcloud.model.PageResourceGroupMemberResource;
import com.knetikcloud.model.PageResourceGroupResource;
import com.knetikcloud.model.PageResourceTemplateResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.TemplateResource;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UsersGroupsApi
 */
@Ignore
public class UsersGroupsApiTest {

    private final UsersGroupsApi api = new UsersGroupsApi();

    
    /**
     * Adds a new member to the group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addMemberToGroupTest() throws ApiException {
        String uniqueName = null;
        GroupMemberResource user = null;
        GroupMemberResource response = api.addMemberToGroup(uniqueName, user);

        // TODO: test validations
    }
    
    /**
     * Adds multiple members to the group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addMembersToGroupTest() throws ApiException {
        String uniqueName = null;
        List<GroupMemberResource> users = null;
        List<GroupMemberResource> response = api.addMembersToGroup(uniqueName, users);

        // TODO: test validations
    }
    
    /**
     * Create a group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createGroupTest() throws ApiException {
        GroupResource groupResource = null;
        GroupResource response = api.createGroup(groupResource);

        // TODO: test validations
    }
    
    /**
     * Create a group template
     *
     * Group Templates define a type of group and the properties they have
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createGroupTemplateTest() throws ApiException {
        TemplateResource groupTemplateResource = null;
        TemplateResource response = api.createGroupTemplate(groupTemplateResource);

        // TODO: test validations
    }
    
    /**
     * Removes a group from the system IF no resources are attached to it
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteGroupTest() throws ApiException {
        String uniqueName = null;
        api.deleteGroup(uniqueName);

        // TODO: test validations
    }
    
    /**
     * Delete a group template
     *
     * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteGroupTemplateTest() throws ApiException {
        String id = null;
        String cascade = null;
        api.deleteGroupTemplate(id, cascade);

        // TODO: test validations
    }
    
    /**
     * Loads a specific group&#39;s details
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getGroupTest() throws ApiException {
        String uniqueName = null;
        GroupResource response = api.getGroup(uniqueName);

        // TODO: test validations
    }
    
    /**
     * Get a user from a group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getGroupMemberTest() throws ApiException {
        String uniqueName = null;
        Integer userId = null;
        GroupMemberResource response = api.getGroupMember(uniqueName, userId);

        // TODO: test validations
    }
    
    /**
     * Lists members of the group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getGroupMembersTest() throws ApiException {
        String uniqueName = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        PageResourceGroupMemberResource response = api.getGroupMembers(uniqueName, size, page, order);

        // TODO: test validations
    }
    
    /**
     * Get a single group template
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getGroupTemplateTest() throws ApiException {
        String id = null;
        TemplateResource response = api.getGroupTemplate(id);

        // TODO: test validations
    }
    
    /**
     * List and search group templates
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getGroupTemplatesTest() throws ApiException {
        Integer size = null;
        Integer page = null;
        String order = null;
        PageResourceTemplateResource response = api.getGroupTemplates(size, page, order);

        // TODO: test validations
    }
    
    /**
     * List groups a user is in
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getGroupsForUserTest() throws ApiException {
        Integer userId = null;
        List<String> response = api.getGroupsForUser(userId);

        // TODO: test validations
    }
    
    /**
     * Removes a user from a group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeGroupMemberTest() throws ApiException {
        String uniqueName = null;
        Integer userId = null;
        api.removeGroupMember(uniqueName, userId);

        // TODO: test validations
    }
    
    /**
     * Update a group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateGroupTest() throws ApiException {
        String uniqueName = null;
        GroupResource groupResource = null;
        api.updateGroup(uniqueName, groupResource);

        // TODO: test validations
    }
    
    /**
     * Change a user&#39;s status
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateGroupMemberStatusTest() throws ApiException {
        String uniqueName = null;
        Integer userId = null;
        String status = null;
        api.updateGroupMemberStatus(uniqueName, userId, status);

        // TODO: test validations
    }
    
    /**
     * Update a group template
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateGroupTemplateTest() throws ApiException {
        String id = null;
        TemplateResource groupTemplateResource = null;
        TemplateResource response = api.updateGroupTemplate(id, groupTemplateResource);

        // TODO: test validations
    }
    
    /**
     * List and search groups
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateGroupsTest() throws ApiException {
        String filterTemplate = null;
        String filterMemberCount = null;
        String filterName = null;
        String filterUniqueName = null;
        String filterParent = null;
        String filterStatus = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        PageResourceGroupResource response = api.updateGroups(filterTemplate, filterMemberCount, filterName, filterUniqueName, filterParent, filterStatus, size, page, order);

        // TODO: test validations
    }
    
}
