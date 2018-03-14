# knetikcloud-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.knetikcloud</groupId>
    <artifactId>knetikcloud-java-client</artifactId>
    <version>3.0.9</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.knetikcloud:knetikcloud-java-client:3.0.9"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/knetikcloud-java-client-3.0.9.jar
* target/lib/*.jar

## Getting Started 

 KnetikCloud (JSAPI) uses a strict Oauth 2.0 implementation with the following grant types: 

* **Password grant**: Used for user authentication, usually from an unsecured web or mobile client when a fully authenticated user account is required to perform actions. ex: 

```curl 
POST /oauth/token?grant_type=password&client_id=web&username=jdoe&password=68a4sd3sd
 ``` 

* **Client credentials grant**: 
 Used for server authentication or secured clients when the secret key cannot be discovered. This kind of grant is typically used for administrative tasks on the application itself or to access other user's account information. 

```curl 
POST /oauth/token grant_type=client_credentials&client_id=server-client-id&client_secret=1s31dfas65d4f3sa651c3s54f 
```  

The endpoint will return a response containing the authentication token as follows: 
```json: 
{"access_token":"25a0659c-6f4a-40bd-950e-0ba4af7acf0f","token_type":"bearer","expires_in":2145660769,"scope":"write read"}
``` 

Use the provided access_token in sub-sequent requests to authenticate (see code below). Make sure you refresh your token before it expires to avoid having to re-authenticate.

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.knetikcloud.client.*;
import com.knetikcloud.client.auth.*;
import com.knetikcloud.model.*;
import com.knetikcloud.api.AccessTokenApi;

import java.io.File;
import java.util.*;

public class AccessTokenApiExample {

    public static void main(String[] args) {
        
        AccessTokenApi apiInstance = new AccessTokenApi();
        String grantType = "client_credentials"; // String | Grant type
        String clientId = "knetik"; // String | The id of the client
        String clientSecret = "clientSecret_example"; // String | The secret key of the client.  Used only with a grant_type of client_credentials
        String username = "username_example"; // String | The username of the client. Used only with a grant_type of password
        String password = "password_example"; // String | The password of the client. Used only with a grant_type of password
        String token = "token_example"; // String | The 3rd party authentication token. Used only with a grant_type of facebook, google, etc (social plugins)
        String refreshToken = "refreshToken_example"; // String | The refresh token obtained during prior authentication. Used only with a grant_type of refresh_token
        try {
            OAuth2Resource result = apiInstance.getOAuthToken(grantType, clientId, clientSecret, username, password, token, refreshToken);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccessTokenApi#getOAuthToken");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://jsapi-integration.us-east-1.elasticbeanstalk.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccessTokenApi* | [**getOAuthToken**](docs/AccessTokenApi.md#getOAuthToken) | **POST** /oauth/token | Get access token
*ActivitiesApi* | [**addUser**](docs/ActivitiesApi.md#addUser) | **POST** /activity-occurrences/{activity_occurrence_id}/users | Add a user to an occurrence
*ActivitiesApi* | [**createActivity**](docs/ActivitiesApi.md#createActivity) | **POST** /activities | Create an activity
*ActivitiesApi* | [**createActivityOccurrence**](docs/ActivitiesApi.md#createActivityOccurrence) | **POST** /activity-occurrences | Create a new activity occurrence. Ex: start a game
*ActivitiesApi* | [**createActivityTemplate**](docs/ActivitiesApi.md#createActivityTemplate) | **POST** /activities/templates | Create a activity template
*ActivitiesApi* | [**deleteActivity**](docs/ActivitiesApi.md#deleteActivity) | **DELETE** /activities/{id} | Delete an activity
*ActivitiesApi* | [**deleteActivityTemplate**](docs/ActivitiesApi.md#deleteActivityTemplate) | **DELETE** /activities/templates/{id} | Delete a activity template
*ActivitiesApi* | [**getActivities**](docs/ActivitiesApi.md#getActivities) | **GET** /activities | List activity definitions
*ActivitiesApi* | [**getActivity**](docs/ActivitiesApi.md#getActivity) | **GET** /activities/{id} | Get a single activity
*ActivitiesApi* | [**getActivityOccurrenceDetails**](docs/ActivitiesApi.md#getActivityOccurrenceDetails) | **GET** /activity-occurrences/{activity_occurrence_id} | Load a single activity occurrence details
*ActivitiesApi* | [**getActivityTemplate**](docs/ActivitiesApi.md#getActivityTemplate) | **GET** /activities/templates/{id} | Get a single activity template
*ActivitiesApi* | [**getActivityTemplates**](docs/ActivitiesApi.md#getActivityTemplates) | **GET** /activities/templates | List and search activity templates
*ActivitiesApi* | [**listActivityOccurrences**](docs/ActivitiesApi.md#listActivityOccurrences) | **GET** /activity-occurrences | List activity occurrences
*ActivitiesApi* | [**removeUser**](docs/ActivitiesApi.md#removeUser) | **DELETE** /activity-occurrences/{activity_occurrence_id}/users/{user_id} | Remove a user from an occurrence
*ActivitiesApi* | [**setActivityOccurrenceResults**](docs/ActivitiesApi.md#setActivityOccurrenceResults) | **POST** /activity-occurrences/{activity_occurrence_id}/results | Sets the status of an activity occurrence to FINISHED and logs metrics
*ActivitiesApi* | [**setActivityOccurrenceSettings**](docs/ActivitiesApi.md#setActivityOccurrenceSettings) | **PUT** /activity-occurrences/{activity_occurrence_id}/settings | Sets the settings of an activity occurrence
*ActivitiesApi* | [**setUserStatus**](docs/ActivitiesApi.md#setUserStatus) | **PUT** /activity-occurrences/{activity_occurrence_id}/users/{user_id}/status | Set a user&#39;s status within an occurrence
*ActivitiesApi* | [**updateActivity**](docs/ActivitiesApi.md#updateActivity) | **PUT** /activities/{id} | Update an activity
*ActivitiesApi* | [**updateActivityOccurrenceStatus**](docs/ActivitiesApi.md#updateActivityOccurrenceStatus) | **PUT** /activity-occurrences/{activity_occurrence_id}/status | Update the status of an activity occurrence
*ActivitiesApi* | [**updateActivityTemplate**](docs/ActivitiesApi.md#updateActivityTemplate) | **PUT** /activities/templates/{id} | Update an activity template
*AmazonWebServicesS3Api* | [**getDownloadURL**](docs/AmazonWebServicesS3Api.md#getDownloadURL) | **GET** /amazon/s3/downloadurl | Get a temporary signed S3 URL for download
*AmazonWebServicesS3Api* | [**getSignedS3URL**](docs/AmazonWebServicesS3Api.md#getSignedS3URL) | **GET** /amazon/s3/signedposturl | Get a signed S3 URL for upload
*AuthClientsApi* | [**createClient**](docs/AuthClientsApi.md#createClient) | **POST** /auth/clients | Create a new client
*AuthClientsApi* | [**deleteClient**](docs/AuthClientsApi.md#deleteClient) | **DELETE** /auth/clients/{client_key} | Delete a client
*AuthClientsApi* | [**getClient**](docs/AuthClientsApi.md#getClient) | **GET** /auth/clients/{client_key} | Get a single client
*AuthClientsApi* | [**getClientGrantTypes**](docs/AuthClientsApi.md#getClientGrantTypes) | **GET** /auth/clients/grant-types | List available client grant types
*AuthClientsApi* | [**getClients**](docs/AuthClientsApi.md#getClients) | **GET** /auth/clients | List and search clients
*AuthClientsApi* | [**setClientGrantTypes**](docs/AuthClientsApi.md#setClientGrantTypes) | **PUT** /auth/clients/{client_key}/grant-types | Set grant types for a client
*AuthClientsApi* | [**setClientRedirectUris**](docs/AuthClientsApi.md#setClientRedirectUris) | **PUT** /auth/clients/{client_key}/redirect-uris | Set redirect uris for a client
*AuthClientsApi* | [**updateClient**](docs/AuthClientsApi.md#updateClient) | **PUT** /auth/clients/{client_key} | Update a client
*AuthPermissionsApi* | [**createPermission**](docs/AuthPermissionsApi.md#createPermission) | **POST** /auth/permissions | Create a new permission
*AuthPermissionsApi* | [**deletePermission**](docs/AuthPermissionsApi.md#deletePermission) | **DELETE** /auth/permissions/{permission} | Delete a permission
*AuthPermissionsApi* | [**getPermission**](docs/AuthPermissionsApi.md#getPermission) | **GET** /auth/permissions/{permission} | Get a single permission
*AuthPermissionsApi* | [**getPermissions**](docs/AuthPermissionsApi.md#getPermissions) | **GET** /auth/permissions | List and search permissions
*AuthPermissionsApi* | [**updatePermission**](docs/AuthPermissionsApi.md#updatePermission) | **PUT** /auth/permissions/{permission} | Update a permission
*AuthRolesApi* | [**createRole**](docs/AuthRolesApi.md#createRole) | **POST** /auth/roles | Create a new role
*AuthRolesApi* | [**deleteRole**](docs/AuthRolesApi.md#deleteRole) | **DELETE** /auth/roles/{role} | Delete a role
*AuthRolesApi* | [**getClientRoles**](docs/AuthRolesApi.md#getClientRoles) | **GET** /auth/clients/{client_key}/roles | Get roles for a client
*AuthRolesApi* | [**getRole**](docs/AuthRolesApi.md#getRole) | **GET** /auth/roles/{role} | Get a single role
*AuthRolesApi* | [**getRoles**](docs/AuthRolesApi.md#getRoles) | **GET** /auth/roles | List and search roles
*AuthRolesApi* | [**getUserRoles**](docs/AuthRolesApi.md#getUserRoles) | **GET** /auth/users/{user_id}/roles | Get roles for a user
*AuthRolesApi* | [**setClientRoles**](docs/AuthRolesApi.md#setClientRoles) | **PUT** /auth/clients/{client_key}/roles | Set roles for a client
*AuthRolesApi* | [**setPermissionsForRole**](docs/AuthRolesApi.md#setPermissionsForRole) | **PUT** /auth/roles/{role}/permissions | Set permissions for a role
*AuthRolesApi* | [**setUserRoles**](docs/AuthRolesApi.md#setUserRoles) | **PUT** /auth/users/{user_id}/roles | Set roles for a user
*AuthRolesApi* | [**updateRole**](docs/AuthRolesApi.md#updateRole) | **PUT** /auth/roles/{role} | Update a role
*AuthTokensApi* | [**deleteTokens**](docs/AuthTokensApi.md#deleteTokens) | **DELETE** /auth/tokens | Delete tokens by username, client id, or both
*AuthTokensApi* | [**getToken**](docs/AuthTokensApi.md#getToken) | **GET** /auth/tokens/{username}/{client_id} | Get a single token by username and client id
*AuthTokensApi* | [**getTokens**](docs/AuthTokensApi.md#getTokens) | **GET** /auth/tokens | List usernames and client ids
*CampaignsApi* | [**addChallengeToCampaign**](docs/CampaignsApi.md#addChallengeToCampaign) | **POST** /campaigns/{id}/challenges | Add a challenge to a campaign
*CampaignsApi* | [**createCampaign**](docs/CampaignsApi.md#createCampaign) | **POST** /campaigns | Create a campaign
*CampaignsApi* | [**createCampaignTemplate**](docs/CampaignsApi.md#createCampaignTemplate) | **POST** /campaigns/templates | Create a campaign template
*CampaignsApi* | [**deleteCampaign**](docs/CampaignsApi.md#deleteCampaign) | **DELETE** /campaigns/{id} | Delete a campaign
*CampaignsApi* | [**deleteCampaignTemplate**](docs/CampaignsApi.md#deleteCampaignTemplate) | **DELETE** /campaigns/templates/{id} | Delete a campaign template
*CampaignsApi* | [**getCampaign**](docs/CampaignsApi.md#getCampaign) | **GET** /campaigns/{id} | Returns a single campaign
*CampaignsApi* | [**getCampaignChallenges**](docs/CampaignsApi.md#getCampaignChallenges) | **GET** /campaigns/{id}/challenges | List the challenges associated with a campaign
*CampaignsApi* | [**getCampaignTemplate**](docs/CampaignsApi.md#getCampaignTemplate) | **GET** /campaigns/templates/{id} | Get a single campaign template
*CampaignsApi* | [**getCampaignTemplates**](docs/CampaignsApi.md#getCampaignTemplates) | **GET** /campaigns/templates | List and search campaign templates
*CampaignsApi* | [**getCampaigns**](docs/CampaignsApi.md#getCampaigns) | **GET** /campaigns | List and search campaigns
*CampaignsApi* | [**removeChallengeFromCampaign**](docs/CampaignsApi.md#removeChallengeFromCampaign) | **DELETE** /campaigns/{campaign_id}/challenges/{id} | Remove a challenge from a campaign
*CampaignsApi* | [**updateCampaign**](docs/CampaignsApi.md#updateCampaign) | **PUT** /campaigns/{id} | Update a campaign
*CampaignsApi* | [**updateCampaignTemplate**](docs/CampaignsApi.md#updateCampaignTemplate) | **PUT** /campaigns/templates/{id} | Update an campaign template
*CampaignsChallengesApi* | [**createChallenge**](docs/CampaignsChallengesApi.md#createChallenge) | **POST** /challenges | Create a challenge
*CampaignsChallengesApi* | [**createChallengeActivity**](docs/CampaignsChallengesApi.md#createChallengeActivity) | **POST** /challenges/{challenge_id}/activities | Create a challenge activity
*CampaignsChallengesApi* | [**createChallengeActivityTemplate**](docs/CampaignsChallengesApi.md#createChallengeActivityTemplate) | **POST** /challenge-activities/templates | Create a challenge activity template
*CampaignsChallengesApi* | [**createChallengeTemplate**](docs/CampaignsChallengesApi.md#createChallengeTemplate) | **POST** /challenges/templates | Create a challenge template
*CampaignsChallengesApi* | [**deleteChallenge**](docs/CampaignsChallengesApi.md#deleteChallenge) | **DELETE** /challenges/{id} | Delete a challenge
*CampaignsChallengesApi* | [**deleteChallengeActivity**](docs/CampaignsChallengesApi.md#deleteChallengeActivity) | **DELETE** /challenges/{challenge_id}/activities/{id} | Delete a challenge activity
*CampaignsChallengesApi* | [**deleteChallengeActivityTemplate**](docs/CampaignsChallengesApi.md#deleteChallengeActivityTemplate) | **DELETE** /challenge-activities/templates/{id} | Delete a challenge activity template
*CampaignsChallengesApi* | [**deleteChallengeEvent**](docs/CampaignsChallengesApi.md#deleteChallengeEvent) | **DELETE** /challenges/events/{id} | Delete a challenge event
*CampaignsChallengesApi* | [**deleteChallengeTemplate**](docs/CampaignsChallengesApi.md#deleteChallengeTemplate) | **DELETE** /challenges/templates/{id} | Delete a challenge template
*CampaignsChallengesApi* | [**getChallenge**](docs/CampaignsChallengesApi.md#getChallenge) | **GET** /challenges/{id} | Retrieve a challenge
*CampaignsChallengesApi* | [**getChallengeActivities**](docs/CampaignsChallengesApi.md#getChallengeActivities) | **GET** /challenges/{challenge_id}/activities | List and search challenge activities
*CampaignsChallengesApi* | [**getChallengeActivity**](docs/CampaignsChallengesApi.md#getChallengeActivity) | **GET** /challenges/{challenge_id}/activities/{id} | Get a single challenge activity
*CampaignsChallengesApi* | [**getChallengeActivityTemplate**](docs/CampaignsChallengesApi.md#getChallengeActivityTemplate) | **GET** /challenge-activities/templates/{id} | Get a single challenge activity template
*CampaignsChallengesApi* | [**getChallengeActivityTemplates**](docs/CampaignsChallengesApi.md#getChallengeActivityTemplates) | **GET** /challenge-activities/templates | List and search challenge activity templates
*CampaignsChallengesApi* | [**getChallengeEvent**](docs/CampaignsChallengesApi.md#getChallengeEvent) | **GET** /challenges/events/{id} | Retrieve a single challenge event details
*CampaignsChallengesApi* | [**getChallengeEvents**](docs/CampaignsChallengesApi.md#getChallengeEvents) | **GET** /challenges/events | Retrieve a list of challenge events
*CampaignsChallengesApi* | [**getChallengeTemplate**](docs/CampaignsChallengesApi.md#getChallengeTemplate) | **GET** /challenges/templates/{id} | Get a single challenge template
*CampaignsChallengesApi* | [**getChallengeTemplates**](docs/CampaignsChallengesApi.md#getChallengeTemplates) | **GET** /challenges/templates | List and search challenge templates
*CampaignsChallengesApi* | [**getChallenges**](docs/CampaignsChallengesApi.md#getChallenges) | **GET** /challenges | Retrieve a list of challenges
*CampaignsChallengesApi* | [**updateChallenge**](docs/CampaignsChallengesApi.md#updateChallenge) | **PUT** /challenges/{id} | Update a challenge
*CampaignsChallengesApi* | [**updateChallengeActivity**](docs/CampaignsChallengesApi.md#updateChallengeActivity) | **PUT** /challenges/{challenge_id}/activities/{id} | Update a challenge activity
*CampaignsChallengesApi* | [**updateChallengeActivityTemplate**](docs/CampaignsChallengesApi.md#updateChallengeActivityTemplate) | **PUT** /challenge-activities/templates/{id} | Update an challenge activity template
*CampaignsChallengesApi* | [**updateChallengeTemplate**](docs/CampaignsChallengesApi.md#updateChallengeTemplate) | **PUT** /challenges/templates/{id} | Update a challenge template
*CampaignsRewardsApi* | [**createRewardSet**](docs/CampaignsRewardsApi.md#createRewardSet) | **POST** /rewards | Create a reward set
*CampaignsRewardsApi* | [**deleteRewardSet**](docs/CampaignsRewardsApi.md#deleteRewardSet) | **DELETE** /rewards/{id} | Delete a reward set
*CampaignsRewardsApi* | [**getRewardSet**](docs/CampaignsRewardsApi.md#getRewardSet) | **GET** /rewards/{id} | Get a single reward set
*CampaignsRewardsApi* | [**getRewardSets**](docs/CampaignsRewardsApi.md#getRewardSets) | **GET** /rewards | List and search reward sets
*CampaignsRewardsApi* | [**updateRewardSet**](docs/CampaignsRewardsApi.md#updateRewardSet) | **PUT** /rewards/{id} | Update a reward set
*CategoriesApi* | [**createCategory**](docs/CategoriesApi.md#createCategory) | **POST** /categories | Create a new category
*CategoriesApi* | [**createCategoryTemplate**](docs/CategoriesApi.md#createCategoryTemplate) | **POST** /categories/templates | Create a category template
*CategoriesApi* | [**deleteCategory**](docs/CategoriesApi.md#deleteCategory) | **DELETE** /categories/{id} | Delete an existing category
*CategoriesApi* | [**deleteCategoryTemplate**](docs/CategoriesApi.md#deleteCategoryTemplate) | **DELETE** /categories/templates/{id} | Delete a category template
*CategoriesApi* | [**getCategories**](docs/CategoriesApi.md#getCategories) | **GET** /categories | List and search categories with optional filters
*CategoriesApi* | [**getCategory**](docs/CategoriesApi.md#getCategory) | **GET** /categories/{id} | Get a single category
*CategoriesApi* | [**getCategoryTemplate**](docs/CategoriesApi.md#getCategoryTemplate) | **GET** /categories/templates/{id} | Get a single category template
*CategoriesApi* | [**getCategoryTemplates**](docs/CategoriesApi.md#getCategoryTemplates) | **GET** /categories/templates | List and search category templates
*CategoriesApi* | [**getTags**](docs/CategoriesApi.md#getTags) | **GET** /tags | List all trivia tags in the system
*CategoriesApi* | [**updateCategory**](docs/CategoriesApi.md#updateCategory) | **PUT** /categories/{id} | Update an existing category
*CategoriesApi* | [**updateCategoryTemplate**](docs/CategoriesApi.md#updateCategoryTemplate) | **PUT** /categories/templates/{id} | Update a category template
*ChatApi* | [**acknowledgeChatMessage**](docs/ChatApi.md#acknowledgeChatMessage) | **PUT** /chat/threads/{id}/acknowledge | Acknowledge number of messages in a thread
*ChatApi* | [**addChatMessageBlacklist**](docs/ChatApi.md#addChatMessageBlacklist) | **POST** /chat/users/{id}/blacklist/{blacklisted_user_id} | Add a user to a chat message blacklist
*ChatApi* | [**deleteChatMessage**](docs/ChatApi.md#deleteChatMessage) | **DELETE** /chat/messages/{id} | Delete a message
*ChatApi* | [**editChatMessage**](docs/ChatApi.md#editChatMessage) | **PUT** /chat/messages/{id} | Edit your message
*ChatApi* | [**getChatMessage**](docs/ChatApi.md#getChatMessage) | **GET** /chat/messages/{id} | Get a message
*ChatApi* | [**getChatMessageBlacklist**](docs/ChatApi.md#getChatMessageBlacklist) | **GET** /chat/users/{id}/blacklist | Get a list of blocked users for chat messaging
*ChatApi* | [**getChatThreads**](docs/ChatApi.md#getChatThreads) | **GET** /chat/threads | List your threads
*ChatApi* | [**getDirectMessages**](docs/ChatApi.md#getDirectMessages) | **GET** /chat/users/{id}/messages | List messages with a user
*ChatApi* | [**getThreadMessages**](docs/ChatApi.md#getThreadMessages) | **GET** /chat/threads/{id}/messages | List messages in a thread
*ChatApi* | [**getTopicMessages**](docs/ChatApi.md#getTopicMessages) | **GET** /chat/topics/{id}/messages | List messages in a topic
*ChatApi* | [**removeChatBlacklist**](docs/ChatApi.md#removeChatBlacklist) | **DELETE** /chat/users/{id}/blacklist/{blacklisted_user_id} | Remove a user from a blacklist
*ChatApi* | [**sendChatMessage**](docs/ChatApi.md#sendChatMessage) | **POST** /chat/messages | Send a message
*ConfigsApi* | [**createConfig**](docs/ConfigsApi.md#createConfig) | **POST** /configs | Create a new config
*ConfigsApi* | [**deleteConfig**](docs/ConfigsApi.md#deleteConfig) | **DELETE** /configs/{name} | Delete an existing config
*ConfigsApi* | [**getConfig**](docs/ConfigsApi.md#getConfig) | **GET** /configs/{name} | Get a single config
*ConfigsApi* | [**getConfigs**](docs/ConfigsApi.md#getConfigs) | **GET** /configs | List and search configs
*ConfigsApi* | [**updateConfig**](docs/ConfigsApi.md#updateConfig) | **PUT** /configs/{name} | Update an existing config
*ContentArticlesApi* | [**createArticle**](docs/ContentArticlesApi.md#createArticle) | **POST** /content/articles | Create a new article
*ContentArticlesApi* | [**createArticleTemplate**](docs/ContentArticlesApi.md#createArticleTemplate) | **POST** /content/articles/templates | Create an article template
*ContentArticlesApi* | [**createTemplate**](docs/ContentArticlesApi.md#createTemplate) | **POST** /templates/{type_hint} | Create a template
*ContentArticlesApi* | [**deleteArticle**](docs/ContentArticlesApi.md#deleteArticle) | **DELETE** /content/articles/{id} | Delete an existing article
*ContentArticlesApi* | [**deleteArticleTemplate**](docs/ContentArticlesApi.md#deleteArticleTemplate) | **DELETE** /content/articles/templates/{id} | Delete an article template
*ContentArticlesApi* | [**deleteTemplate**](docs/ContentArticlesApi.md#deleteTemplate) | **DELETE** /templates/{type_hint}/{id} | Delete a template
*ContentArticlesApi* | [**getArticle**](docs/ContentArticlesApi.md#getArticle) | **GET** /content/articles/{id} | Get a single article
*ContentArticlesApi* | [**getArticleTemplate**](docs/ContentArticlesApi.md#getArticleTemplate) | **GET** /content/articles/templates/{id} | Get a single article template
*ContentArticlesApi* | [**getArticleTemplates**](docs/ContentArticlesApi.md#getArticleTemplates) | **GET** /content/articles/templates | List and search article templates
*ContentArticlesApi* | [**getArticles**](docs/ContentArticlesApi.md#getArticles) | **GET** /content/articles | List and search articles
*ContentArticlesApi* | [**getTemplate**](docs/ContentArticlesApi.md#getTemplate) | **GET** /templates/{type_hint}/{id} | Get a template
*ContentArticlesApi* | [**getTemplates**](docs/ContentArticlesApi.md#getTemplates) | **GET** /templates/{type_hint} | List and search templates
*ContentArticlesApi* | [**updateArticle**](docs/ContentArticlesApi.md#updateArticle) | **PUT** /content/articles/{id} | Update an existing article
*ContentArticlesApi* | [**updateArticleTemplate**](docs/ContentArticlesApi.md#updateArticleTemplate) | **PUT** /content/articles/templates/{id} | Update an article template
*ContentArticlesApi* | [**updateTemplate**](docs/ContentArticlesApi.md#updateTemplate) | **PUT** /templates/{type_hint}/{id} | Update a template
*ContentArticlesApi* | [**validate**](docs/ContentArticlesApi.md#validate) | **POST** /templates/{type_hint}/validate | Validate a templated resource
*ContentCommentsApi* | [**addComment**](docs/ContentCommentsApi.md#addComment) | **POST** /comments | Add a new comment
*ContentCommentsApi* | [**deleteComment**](docs/ContentCommentsApi.md#deleteComment) | **DELETE** /comments/{id} | Delete a comment
*ContentCommentsApi* | [**getComment**](docs/ContentCommentsApi.md#getComment) | **GET** /comments/{id} | Return a comment
*ContentCommentsApi* | [**getComments**](docs/ContentCommentsApi.md#getComments) | **GET** /comments | Returns a page of comments
*ContentCommentsApi* | [**updateComment**](docs/ContentCommentsApi.md#updateComment) | **PUT** /comments/{id}/content | Update a comment
*CurrenciesApi* | [**createCurrency**](docs/CurrenciesApi.md#createCurrency) | **POST** /currencies | Create a currency
*CurrenciesApi* | [**deleteCurrency**](docs/CurrenciesApi.md#deleteCurrency) | **DELETE** /currencies/{code} | Delete a currency
*CurrenciesApi* | [**getCurrencies**](docs/CurrenciesApi.md#getCurrencies) | **GET** /currencies | List and search currencies
*CurrenciesApi* | [**getCurrency**](docs/CurrenciesApi.md#getCurrency) | **GET** /currencies/{code} | Get a single currency
*CurrenciesApi* | [**updateCurrency**](docs/CurrenciesApi.md#updateCurrency) | **PUT** /currencies/{code} | Update a currency
*DevicesApi* | [**addDeviceUsers**](docs/DevicesApi.md#addDeviceUsers) | **POST** /devices/{id}/users | Add device users
*DevicesApi* | [**createDevice**](docs/DevicesApi.md#createDevice) | **POST** /devices | Create a device
*DevicesApi* | [**createDeviceTemplate**](docs/DevicesApi.md#createDeviceTemplate) | **POST** /devices/templates | Create a device template
*DevicesApi* | [**deleteDevice**](docs/DevicesApi.md#deleteDevice) | **DELETE** /devices/{id} | Delete a device
*DevicesApi* | [**deleteDeviceTemplate**](docs/DevicesApi.md#deleteDeviceTemplate) | **DELETE** /devices/templates/{id} | Delete an device template
*DevicesApi* | [**deleteDeviceUser**](docs/DevicesApi.md#deleteDeviceUser) | **DELETE** /devices/{id}/users/{user_id} | Delete a device user
*DevicesApi* | [**deleteDeviceUsers**](docs/DevicesApi.md#deleteDeviceUsers) | **DELETE** /devices/{id}/users | Delete all device users
*DevicesApi* | [**getDevice**](docs/DevicesApi.md#getDevice) | **GET** /devices/{id} | Get a single device
*DevicesApi* | [**getDeviceTemplate**](docs/DevicesApi.md#getDeviceTemplate) | **GET** /devices/templates/{id} | Get a single device template
*DevicesApi* | [**getDeviceTemplates**](docs/DevicesApi.md#getDeviceTemplates) | **GET** /devices/templates | List and search device templates
*DevicesApi* | [**getDevices**](docs/DevicesApi.md#getDevices) | **GET** /devices | List and search devices
*DevicesApi* | [**updateDevice**](docs/DevicesApi.md#updateDevice) | **PUT** /devices/{id} | Update a device
*DevicesApi* | [**updateDeviceTemplate**](docs/DevicesApi.md#updateDeviceTemplate) | **PUT** /devices/templates/{id} | Update an device template
*DispositionsApi* | [**addDisposition**](docs/DispositionsApi.md#addDisposition) | **POST** /dispositions | Add a new disposition
*DispositionsApi* | [**deleteDisposition**](docs/DispositionsApi.md#deleteDisposition) | **DELETE** /dispositions/{id} | Delete a disposition
*DispositionsApi* | [**getDisposition**](docs/DispositionsApi.md#getDisposition) | **GET** /dispositions/{id} | Returns a disposition
*DispositionsApi* | [**getDispositionCounts**](docs/DispositionsApi.md#getDispositionCounts) | **GET** /dispositions/count | Returns a list of disposition counts
*DispositionsApi* | [**getDispositions**](docs/DispositionsApi.md#getDispositions) | **GET** /dispositions | Returns a page of dispositions
*FulfillmentApi* | [**createFulfillmentType**](docs/FulfillmentApi.md#createFulfillmentType) | **POST** /store/fulfillment/types | Create a fulfillment type
*FulfillmentApi* | [**deleteFulfillmentType**](docs/FulfillmentApi.md#deleteFulfillmentType) | **DELETE** /store/fulfillment/types/{id} | Delete a fulfillment type
*FulfillmentApi* | [**getFulfillmentType**](docs/FulfillmentApi.md#getFulfillmentType) | **GET** /store/fulfillment/types/{id} | Get a single fulfillment type
*FulfillmentApi* | [**getFulfillmentTypes**](docs/FulfillmentApi.md#getFulfillmentTypes) | **GET** /store/fulfillment/types | List and search fulfillment types
*FulfillmentApi* | [**updateFulfillmentType**](docs/FulfillmentApi.md#updateFulfillmentType) | **PUT** /store/fulfillment/types/{id} | Update a fulfillment type
*GamificationAchievementsApi* | [**createAchievement**](docs/GamificationAchievementsApi.md#createAchievement) | **POST** /achievements | Create a new achievement definition
*GamificationAchievementsApi* | [**createAchievementTemplate**](docs/GamificationAchievementsApi.md#createAchievementTemplate) | **POST** /achievements/templates | Create an achievement template
*GamificationAchievementsApi* | [**deleteAchievement**](docs/GamificationAchievementsApi.md#deleteAchievement) | **DELETE** /achievements/{name} | Delete an achievement definition
*GamificationAchievementsApi* | [**deleteAchievementTemplate**](docs/GamificationAchievementsApi.md#deleteAchievementTemplate) | **DELETE** /achievements/templates/{id} | Delete an achievement template
*GamificationAchievementsApi* | [**getAchievement**](docs/GamificationAchievementsApi.md#getAchievement) | **GET** /achievements/{name} | Get a single achievement definition
*GamificationAchievementsApi* | [**getAchievementTemplate**](docs/GamificationAchievementsApi.md#getAchievementTemplate) | **GET** /achievements/templates/{id} | Get a single achievement template
*GamificationAchievementsApi* | [**getAchievementTemplates**](docs/GamificationAchievementsApi.md#getAchievementTemplates) | **GET** /achievements/templates | List and search achievement templates
*GamificationAchievementsApi* | [**getAchievementTriggers**](docs/GamificationAchievementsApi.md#getAchievementTriggers) | **GET** /achievements/triggers | Get the list of triggers that can be used to trigger an achievement progress update
*GamificationAchievementsApi* | [**getAchievements**](docs/GamificationAchievementsApi.md#getAchievements) | **GET** /achievements | Get all achievement definitions in the system
*GamificationAchievementsApi* | [**getDerivedAchievements**](docs/GamificationAchievementsApi.md#getDerivedAchievements) | **GET** /achievements/derived/{name} | Get a list of derived achievements
*GamificationAchievementsApi* | [**getUserAchievementProgress**](docs/GamificationAchievementsApi.md#getUserAchievementProgress) | **GET** /users/{user_id}/achievements/{achievement_name} | Retrieve progress on a given achievement for a given user
*GamificationAchievementsApi* | [**getUserAchievementsProgress**](docs/GamificationAchievementsApi.md#getUserAchievementsProgress) | **GET** /users/{user_id}/achievements | Retrieve progress on achievements for a given user
*GamificationAchievementsApi* | [**getUsersAchievementProgress**](docs/GamificationAchievementsApi.md#getUsersAchievementProgress) | **GET** /users/achievements/{achievement_name} | Retrieve progress on a given achievement for all users
*GamificationAchievementsApi* | [**getUsersAchievementsProgress**](docs/GamificationAchievementsApi.md#getUsersAchievementsProgress) | **GET** /users/achievements | Retrieve progress on achievements for all users
*GamificationAchievementsApi* | [**incrementAchievementProgress**](docs/GamificationAchievementsApi.md#incrementAchievementProgress) | **POST** /users/{user_id}/achievements/{achievement_name}/progress | Increment an achievement progress record for a user
*GamificationAchievementsApi* | [**setAchievementProgress**](docs/GamificationAchievementsApi.md#setAchievementProgress) | **PUT** /users/{user_id}/achievements/{achievement_name}/progress | Set an achievement progress record for a user
*GamificationAchievementsApi* | [**updateAchievement**](docs/GamificationAchievementsApi.md#updateAchievement) | **PUT** /achievements/{name} | Update an achievement definition
*GamificationAchievementsApi* | [**updateAchievementTemplate**](docs/GamificationAchievementsApi.md#updateAchievementTemplate) | **PUT** /achievements/templates/{id} | Update an achievement template
*GamificationLeaderboardsApi* | [**getLeaderboard**](docs/GamificationLeaderboardsApi.md#getLeaderboard) | **GET** /leaderboards/{context_type}/{context_id} | Retrieves leaderboard details and paginated entries
*GamificationLeaderboardsApi* | [**getLeaderboardRank**](docs/GamificationLeaderboardsApi.md#getLeaderboardRank) | **GET** /leaderboards/{context_type}/{context_id}/users/{id}/rank | Retrieves a specific user entry with rank
*GamificationLeaderboardsApi* | [**getLeaderboardStrategies**](docs/GamificationLeaderboardsApi.md#getLeaderboardStrategies) | **GET** /leaderboards/strategies | Get a list of available leaderboard strategy names
*GamificationLevelingApi* | [**createLevel**](docs/GamificationLevelingApi.md#createLevel) | **POST** /leveling | Create a level schema
*GamificationLevelingApi* | [**deleteLevel**](docs/GamificationLevelingApi.md#deleteLevel) | **DELETE** /leveling/{name} | Delete a level
*GamificationLevelingApi* | [**getLevel**](docs/GamificationLevelingApi.md#getLevel) | **GET** /leveling/{name} | Retrieve a level
*GamificationLevelingApi* | [**getLevelTriggers**](docs/GamificationLevelingApi.md#getLevelTriggers) | **GET** /leveling/triggers | Get the list of triggers that can be used to trigger a leveling progress update
*GamificationLevelingApi* | [**getLevels**](docs/GamificationLevelingApi.md#getLevels) | **GET** /leveling | List and search levels
*GamificationLevelingApi* | [**getUserLevel**](docs/GamificationLevelingApi.md#getUserLevel) | **GET** /users/{user_id}/leveling/{name} | Get a user&#39;s progress for a given level schema
*GamificationLevelingApi* | [**getUserLevels**](docs/GamificationLevelingApi.md#getUserLevels) | **GET** /users/{user_id}/leveling | Get a user&#39;s progress for all level schemas
*GamificationLevelingApi* | [**incrementProgress**](docs/GamificationLevelingApi.md#incrementProgress) | **POST** /users/{user_id}/leveling/{name}/progress | Update or create a leveling progress record for a user
*GamificationLevelingApi* | [**setProgress**](docs/GamificationLevelingApi.md#setProgress) | **PUT** /users/{user_id}/leveling/{name}/progress | Set leveling progress for a user
*GamificationLevelingApi* | [**updateLevel**](docs/GamificationLevelingApi.md#updateLevel) | **PUT** /leveling/{name} | Update a level
*GamificationMetricsApi* | [**addMetric**](docs/GamificationMetricsApi.md#addMetric) | **POST** /metrics | Add a metric
*GamificationTriviaApi* | [**addQuestionAnswers**](docs/GamificationTriviaApi.md#addQuestionAnswers) | **POST** /trivia/questions/{question_id}/answers | Add an answer to a question
*GamificationTriviaApi* | [**addQuestionTag**](docs/GamificationTriviaApi.md#addQuestionTag) | **POST** /trivia/questions/{id}/tags | Add a tag to a question
*GamificationTriviaApi* | [**addTagToQuestionsBatch**](docs/GamificationTriviaApi.md#addTagToQuestionsBatch) | **POST** /trivia/questions/tags | Add a tag to a batch of questions
*GamificationTriviaApi* | [**createImportJob**](docs/GamificationTriviaApi.md#createImportJob) | **POST** /trivia/import | Create an import job
*GamificationTriviaApi* | [**createQuestion**](docs/GamificationTriviaApi.md#createQuestion) | **POST** /trivia/questions | Create a question
*GamificationTriviaApi* | [**createQuestionTemplate**](docs/GamificationTriviaApi.md#createQuestionTemplate) | **POST** /trivia/questions/templates | Create a question template
*GamificationTriviaApi* | [**deleteImportJob**](docs/GamificationTriviaApi.md#deleteImportJob) | **DELETE** /trivia/import/{id} | Delete an import job
*GamificationTriviaApi* | [**deleteQuestion**](docs/GamificationTriviaApi.md#deleteQuestion) | **DELETE** /trivia/questions/{id} | Delete a question
*GamificationTriviaApi* | [**deleteQuestionAnswers**](docs/GamificationTriviaApi.md#deleteQuestionAnswers) | **DELETE** /trivia/questions/{question_id}/answers/{id} | Remove an answer from a question
*GamificationTriviaApi* | [**deleteQuestionTemplate**](docs/GamificationTriviaApi.md#deleteQuestionTemplate) | **DELETE** /trivia/questions/templates/{id} | Delete a question template
*GamificationTriviaApi* | [**getImportJob**](docs/GamificationTriviaApi.md#getImportJob) | **GET** /trivia/import/{id} | Get an import job
*GamificationTriviaApi* | [**getImportJobs**](docs/GamificationTriviaApi.md#getImportJobs) | **GET** /trivia/import | Get a list of import job
*GamificationTriviaApi* | [**getQuestion**](docs/GamificationTriviaApi.md#getQuestion) | **GET** /trivia/questions/{id} | Get a single question
*GamificationTriviaApi* | [**getQuestionAnswer**](docs/GamificationTriviaApi.md#getQuestionAnswer) | **GET** /trivia/questions/{question_id}/answers/{id} | Get an answer for a question
*GamificationTriviaApi* | [**getQuestionAnswers**](docs/GamificationTriviaApi.md#getQuestionAnswers) | **GET** /trivia/questions/{question_id}/answers | List the answers available for a question
*GamificationTriviaApi* | [**getQuestionDeltas**](docs/GamificationTriviaApi.md#getQuestionDeltas) | **GET** /trivia/questions/delta | List question deltas in ascending order of updated date
*GamificationTriviaApi* | [**getQuestionTags**](docs/GamificationTriviaApi.md#getQuestionTags) | **GET** /trivia/questions/{id}/tags | List the tags for a question
*GamificationTriviaApi* | [**getQuestionTemplate**](docs/GamificationTriviaApi.md#getQuestionTemplate) | **GET** /trivia/questions/templates/{id} | Get a single question template
*GamificationTriviaApi* | [**getQuestionTemplates**](docs/GamificationTriviaApi.md#getQuestionTemplates) | **GET** /trivia/questions/templates | List and search question templates
*GamificationTriviaApi* | [**getQuestions**](docs/GamificationTriviaApi.md#getQuestions) | **GET** /trivia/questions | List and search questions
*GamificationTriviaApi* | [**getQuestionsCount**](docs/GamificationTriviaApi.md#getQuestionsCount) | **GET** /trivia/questions/count | Count questions based on filters
*GamificationTriviaApi* | [**processImportJob**](docs/GamificationTriviaApi.md#processImportJob) | **POST** /trivia/import/{id}/process | Start processing an import job
*GamificationTriviaApi* | [**removeQuestionTag**](docs/GamificationTriviaApi.md#removeQuestionTag) | **DELETE** /trivia/questions/{id}/tags/{tag} | Remove a tag from a question
*GamificationTriviaApi* | [**removeTagToQuestionsBatch**](docs/GamificationTriviaApi.md#removeTagToQuestionsBatch) | **DELETE** /trivia/questions/tags/{tag} | Remove a tag from a batch of questions
*GamificationTriviaApi* | [**searchQuestionTags**](docs/GamificationTriviaApi.md#searchQuestionTags) | **GET** /trivia/tags | List and search tags by the beginning of the string
*GamificationTriviaApi* | [**updateImportJob**](docs/GamificationTriviaApi.md#updateImportJob) | **PUT** /trivia/import/{id} | Update an import job
*GamificationTriviaApi* | [**updateQuestion**](docs/GamificationTriviaApi.md#updateQuestion) | **PUT** /trivia/questions/{id} | Update a question
*GamificationTriviaApi* | [**updateQuestionAnswer**](docs/GamificationTriviaApi.md#updateQuestionAnswer) | **PUT** /trivia/questions/{question_id}/answers/{id} | Update an answer for a question
*GamificationTriviaApi* | [**updateQuestionTemplate**](docs/GamificationTriviaApi.md#updateQuestionTemplate) | **PUT** /trivia/questions/templates/{id} | Update a question template
*GamificationTriviaApi* | [**updateQuestionsInBulk**](docs/GamificationTriviaApi.md#updateQuestionsInBulk) | **PUT** /trivia/questions | Bulk update questions
*InvoicesApi* | [**createInvoice**](docs/InvoicesApi.md#createInvoice) | **POST** /invoices | Create an invoice
*InvoicesApi* | [**getFulFillmentStatuses**](docs/InvoicesApi.md#getFulFillmentStatuses) | **GET** /invoices/fulfillment-statuses | Lists available fulfillment statuses
*InvoicesApi* | [**getInvoice**](docs/InvoicesApi.md#getInvoice) | **GET** /invoices/{id} | Retrieve an invoice
*InvoicesApi* | [**getInvoiceLogs**](docs/InvoicesApi.md#getInvoiceLogs) | **GET** /invoices/{id}/logs | List invoice logs
*InvoicesApi* | [**getInvoices**](docs/InvoicesApi.md#getInvoices) | **GET** /invoices | Retrieve invoices
*InvoicesApi* | [**getPaymentStatuses**](docs/InvoicesApi.md#getPaymentStatuses) | **GET** /invoices/payment-statuses | Lists available payment statuses
*InvoicesApi* | [**payInvoice**](docs/InvoicesApi.md#payInvoice) | **POST** /invoices/{id}/payments | Pay an invoice using a saved payment method
*InvoicesApi* | [**setBundledInvoiceItemFulfillmentStatus**](docs/InvoicesApi.md#setBundledInvoiceItemFulfillmentStatus) | **PUT** /invoices/{id}/items/{bundleSku}/bundled-skus/{sku}/fulfillment-status | Set the fulfillment status of a bundled invoice item
*InvoicesApi* | [**setExternalRef**](docs/InvoicesApi.md#setExternalRef) | **PUT** /invoices/{id}/external-ref | Set the external reference of an invoice
*InvoicesApi* | [**setInvoiceItemFulfillmentStatus**](docs/InvoicesApi.md#setInvoiceItemFulfillmentStatus) | **PUT** /invoices/{id}/items/{sku}/fulfillment-status | Set the fulfillment status of an invoice item
*InvoicesApi* | [**setOrderNotes**](docs/InvoicesApi.md#setOrderNotes) | **PUT** /invoices/{id}/order-notes | Set the order notes of an invoice
*InvoicesApi* | [**setPaymentStatus**](docs/InvoicesApi.md#setPaymentStatus) | **PUT** /invoices/{id}/payment-status | Set the payment status of an invoice
*InvoicesApi* | [**updateBillingInfo**](docs/InvoicesApi.md#updateBillingInfo) | **PUT** /invoices/{id}/billing-address | Set or update billing info
*LocationsApi* | [**getCountries**](docs/LocationsApi.md#getCountries) | **GET** /location/countries | Get a list of countries
*LocationsApi* | [**getCountryByGeoLocation**](docs/LocationsApi.md#getCountryByGeoLocation) | **GET** /location/geolocation/country | Get the iso3 code of your country
*LocationsApi* | [**getCountryStates**](docs/LocationsApi.md#getCountryStates) | **GET** /location/countries/{country_code_iso3}/states | Get a list of a country&#39;s states
*LocationsApi* | [**getCurrencyByGeoLocation**](docs/LocationsApi.md#getCurrencyByGeoLocation) | **GET** /location/geolocation/currency | Get the currency information of your country
*LogsApi* | [**addUserLog**](docs/LogsApi.md#addUserLog) | **POST** /audit/logs | Add a user log entry
*LogsApi* | [**getBREEventLog**](docs/LogsApi.md#getBREEventLog) | **GET** /bre/logs/event-log/{id} | Get an existing BRE event log entry by id
*LogsApi* | [**getBREEventLogs**](docs/LogsApi.md#getBREEventLogs) | **GET** /bre/logs/event-log | Returns a list of BRE event log entries
*LogsApi* | [**getBREForwardLog**](docs/LogsApi.md#getBREForwardLog) | **GET** /bre/logs/forward-log/{id} | Get an existing forward log entry by id
*LogsApi* | [**getBREForwardLogs**](docs/LogsApi.md#getBREForwardLogs) | **GET** /bre/logs/forward-log | Returns a list of forward log entries
*LogsApi* | [**getUserLog**](docs/LogsApi.md#getUserLog) | **GET** /audit/logs/{id} | Returns a user log entry by id
*LogsApi* | [**getUserLogs**](docs/LogsApi.md#getUserLogs) | **GET** /audit/logs | Returns a page of user logs entries
*MediaArtistsApi* | [**addArtist**](docs/MediaArtistsApi.md#addArtist) | **POST** /media/artists | Adds a new artist in the system
*MediaArtistsApi* | [**createArtistTemplate**](docs/MediaArtistsApi.md#createArtistTemplate) | **POST** /media/artists/templates | Create an artist template
*MediaArtistsApi* | [**deleteArtist**](docs/MediaArtistsApi.md#deleteArtist) | **DELETE** /media/artists/{id} | Removes an artist from the system IF no resources are attached to it
*MediaArtistsApi* | [**deleteArtistTemplate**](docs/MediaArtistsApi.md#deleteArtistTemplate) | **DELETE** /media/artists/templates/{id} | Delete an artist template
*MediaArtistsApi* | [**getArtist**](docs/MediaArtistsApi.md#getArtist) | **GET** /media/artists/{id} | Loads a specific artist details
*MediaArtistsApi* | [**getArtistTemplate**](docs/MediaArtistsApi.md#getArtistTemplate) | **GET** /media/artists/templates/{id} | Get a single artist template
*MediaArtistsApi* | [**getArtistTemplates**](docs/MediaArtistsApi.md#getArtistTemplates) | **GET** /media/artists/templates | List and search artist templates
*MediaArtistsApi* | [**getArtists**](docs/MediaArtistsApi.md#getArtists) | **GET** /media/artists | Search for artists
*MediaArtistsApi* | [**updateArtist**](docs/MediaArtistsApi.md#updateArtist) | **PUT** /media/artists/{id} | Modifies an artist details
*MediaArtistsApi* | [**updateArtistTemplate**](docs/MediaArtistsApi.md#updateArtistTemplate) | **PUT** /media/artists/templates/{id} | Update an artist template
*MediaModerationApi* | [**addFlag**](docs/MediaModerationApi.md#addFlag) | **POST** /moderation/flags | Add a flag
*MediaModerationApi* | [**deleteFlag**](docs/MediaModerationApi.md#deleteFlag) | **DELETE** /moderation/flags | Delete a flag
*MediaModerationApi* | [**getFlags**](docs/MediaModerationApi.md#getFlags) | **GET** /moderation/flags | Returns a page of flags
*MediaModerationApi* | [**getModerationReport**](docs/MediaModerationApi.md#getModerationReport) | **GET** /moderation/reports/{id} | Get a flag report
*MediaModerationApi* | [**getModerationReports**](docs/MediaModerationApi.md#getModerationReports) | **GET** /moderation/reports | Returns a page of flag reports
*MediaModerationApi* | [**updateModerationReport**](docs/MediaModerationApi.md#updateModerationReport) | **PUT** /moderation/reports/{id} | Update a flag report
*MediaPollsApi* | [**answerPoll**](docs/MediaPollsApi.md#answerPoll) | **POST** /media/polls/{id}/response | Add your vote to a poll
*MediaPollsApi* | [**createPoll**](docs/MediaPollsApi.md#createPoll) | **POST** /media/polls | Create a new poll
*MediaPollsApi* | [**createPollTemplate**](docs/MediaPollsApi.md#createPollTemplate) | **POST** /media/polls/templates | Create a poll template
*MediaPollsApi* | [**deletePoll**](docs/MediaPollsApi.md#deletePoll) | **DELETE** /media/polls/{id} | Delete an existing poll
*MediaPollsApi* | [**deletePollTemplate**](docs/MediaPollsApi.md#deletePollTemplate) | **DELETE** /media/polls/templates/{id} | Delete a poll template
*MediaPollsApi* | [**getPoll**](docs/MediaPollsApi.md#getPoll) | **GET** /media/polls/{id} | Get a single poll
*MediaPollsApi* | [**getPollAnswer**](docs/MediaPollsApi.md#getPollAnswer) | **GET** /media/polls/{id}/response | Get poll answer
*MediaPollsApi* | [**getPollTemplate**](docs/MediaPollsApi.md#getPollTemplate) | **GET** /media/polls/templates/{id} | Get a single poll template
*MediaPollsApi* | [**getPollTemplates**](docs/MediaPollsApi.md#getPollTemplates) | **GET** /media/polls/templates | List and search poll templates
*MediaPollsApi* | [**getPolls**](docs/MediaPollsApi.md#getPolls) | **GET** /media/polls | List and search polls
*MediaPollsApi* | [**updatePoll**](docs/MediaPollsApi.md#updatePoll) | **PUT** /media/polls/{id} | Update an existing poll
*MediaPollsApi* | [**updatePollTemplate**](docs/MediaPollsApi.md#updatePollTemplate) | **PUT** /media/polls/templates/{id} | Update a poll template
*MediaVideosApi* | [**addUserToVideoWhitelist**](docs/MediaVideosApi.md#addUserToVideoWhitelist) | **POST** /media/videos/{id}/whitelist | Adds a user to a video&#39;s whitelist
*MediaVideosApi* | [**addVideo**](docs/MediaVideosApi.md#addVideo) | **POST** /media/videos | Adds a new video in the system
*MediaVideosApi* | [**addVideoComment**](docs/MediaVideosApi.md#addVideoComment) | **POST** /media/videos/{video_id}/comments | Add a new video comment
*MediaVideosApi* | [**addVideoContributor**](docs/MediaVideosApi.md#addVideoContributor) | **POST** /media/videos/{video_id}/contributors | Adds a contributor to a video
*MediaVideosApi* | [**addVideoFlag**](docs/MediaVideosApi.md#addVideoFlag) | **POST** /media/videos/{video_id}/moderation | Add a new flag
*MediaVideosApi* | [**addVideoRelationships**](docs/MediaVideosApi.md#addVideoRelationships) | **POST** /media/videos/{video_id}/related | Adds one or more existing videos as related to this one
*MediaVideosApi* | [**createVideoDisposition**](docs/MediaVideosApi.md#createVideoDisposition) | **POST** /media/videos/{video_id}/dispositions | Create a video disposition
*MediaVideosApi* | [**createVideoTemplate**](docs/MediaVideosApi.md#createVideoTemplate) | **POST** /media/videos/templates | Create a video template
*MediaVideosApi* | [**deleteVideo**](docs/MediaVideosApi.md#deleteVideo) | **DELETE** /media/videos/{id} | Deletes a video from the system if no resources are attached to it
*MediaVideosApi* | [**deleteVideoComment**](docs/MediaVideosApi.md#deleteVideoComment) | **DELETE** /media/videos/{video_id}/comments/{id} | Delete a video comment
*MediaVideosApi* | [**deleteVideoDisposition**](docs/MediaVideosApi.md#deleteVideoDisposition) | **DELETE** /media/videos/{video_id}/dispositions/{disposition_id} | Delete a video disposition
*MediaVideosApi* | [**deleteVideoFlag**](docs/MediaVideosApi.md#deleteVideoFlag) | **DELETE** /media/videos/{video_id}/moderation | Delete a flag
*MediaVideosApi* | [**deleteVideoRelationship**](docs/MediaVideosApi.md#deleteVideoRelationship) | **DELETE** /media/videos/{video_id}/related/{id} | Delete a video&#39;s relationship
*MediaVideosApi* | [**deleteVideoTemplate**](docs/MediaVideosApi.md#deleteVideoTemplate) | **DELETE** /media/videos/templates/{id} | Delete a video template
*MediaVideosApi* | [**getUserVideos**](docs/MediaVideosApi.md#getUserVideos) | **GET** /users/{user_id}/videos | Get user videos
*MediaVideosApi* | [**getVideo**](docs/MediaVideosApi.md#getVideo) | **GET** /media/videos/{id} | Loads a specific video details
*MediaVideosApi* | [**getVideoComments**](docs/MediaVideosApi.md#getVideoComments) | **GET** /media/videos/{video_id}/comments | Returns a page of comments for a video
*MediaVideosApi* | [**getVideoDispositions**](docs/MediaVideosApi.md#getVideoDispositions) | **GET** /media/videos/{video_id}/dispositions | Returns a page of dispositions for a video
*MediaVideosApi* | [**getVideoRelationships**](docs/MediaVideosApi.md#getVideoRelationships) | **GET** /media/videos/{video_id}/related | Returns a page of video relationships
*MediaVideosApi* | [**getVideoTemplate**](docs/MediaVideosApi.md#getVideoTemplate) | **GET** /media/videos/templates/{id} | Get a single video template
*MediaVideosApi* | [**getVideoTemplates**](docs/MediaVideosApi.md#getVideoTemplates) | **GET** /media/videos/templates | List and search video templates
*MediaVideosApi* | [**getVideos**](docs/MediaVideosApi.md#getVideos) | **GET** /media/videos | Search videos using the documented filters
*MediaVideosApi* | [**removeUserFromVideoWhitelist**](docs/MediaVideosApi.md#removeUserFromVideoWhitelist) | **DELETE** /media/videos/{video_id}/whitelist/{id} | Removes a user from a video&#39;s whitelist
*MediaVideosApi* | [**removeVideoContributor**](docs/MediaVideosApi.md#removeVideoContributor) | **DELETE** /media/videos/{video_id}/contributors/{id} | Removes a contributor from a video
*MediaVideosApi* | [**updateVideo**](docs/MediaVideosApi.md#updateVideo) | **PUT** /media/videos/{id} | Modifies a video&#39;s details
*MediaVideosApi* | [**updateVideoComment**](docs/MediaVideosApi.md#updateVideoComment) | **PUT** /media/videos/{video_id}/comments/{id}/content | Update a video comment
*MediaVideosApi* | [**updateVideoRelationship**](docs/MediaVideosApi.md#updateVideoRelationship) | **PUT** /media/videos/{video_id}/related/{id}/relationship_details | Update a video&#39;s relationship details
*MediaVideosApi* | [**updateVideoTemplate**](docs/MediaVideosApi.md#updateVideoTemplate) | **PUT** /media/videos/templates/{id} | Update a video template
*MediaVideosApi* | [**viewVideo**](docs/MediaVideosApi.md#viewVideo) | **POST** /media/videos/{id}/views | Increment a video&#39;s view count
*MessagingApi* | [**compileMessageTemplate**](docs/MessagingApi.md#compileMessageTemplate) | **POST** /messaging/templates/compilations | Compile a message template
*MessagingApi* | [**createMessageTemplate**](docs/MessagingApi.md#createMessageTemplate) | **POST** /messaging/templates | Create a message template
*MessagingApi* | [**deleteMessageTemplate**](docs/MessagingApi.md#deleteMessageTemplate) | **DELETE** /messaging/templates/{id} | Delete an existing message template
*MessagingApi* | [**getMessageTemplate**](docs/MessagingApi.md#getMessageTemplate) | **GET** /messaging/templates/{id} | Get a single message template
*MessagingApi* | [**getMessageTemplates**](docs/MessagingApi.md#getMessageTemplates) | **GET** /messaging/templates | List and search message templates
*MessagingApi* | [**sendMessage**](docs/MessagingApi.md#sendMessage) | **POST** /messaging/message | Send a message
*MessagingApi* | [**sendRawEmail**](docs/MessagingApi.md#sendRawEmail) | **POST** /messaging/raw-email | Send a raw email to one or more users
*MessagingApi* | [**sendRawPush**](docs/MessagingApi.md#sendRawPush) | **POST** /messaging/raw-push | Send a raw push notification
*MessagingApi* | [**sendRawSMS**](docs/MessagingApi.md#sendRawSMS) | **POST** /messaging/raw-sms | Send a raw SMS
*MessagingApi* | [**sendTemplatedEmail**](docs/MessagingApi.md#sendTemplatedEmail) | **POST** /messaging/templated-email | Send a templated email to one or more users
*MessagingApi* | [**sendTemplatedPush**](docs/MessagingApi.md#sendTemplatedPush) | **POST** /messaging/templated-push | Send a templated push notification
*MessagingApi* | [**sendTemplatedSMS**](docs/MessagingApi.md#sendTemplatedSMS) | **POST** /messaging/templated-sms | Send a new templated SMS
*MessagingApi* | [**sendWebsocket**](docs/MessagingApi.md#sendWebsocket) | **POST** /messaging/websocket-message | Send a websocket message
*MessagingApi* | [**updateMessageTemplate**](docs/MessagingApi.md#updateMessageTemplate) | **PUT** /messaging/templates/{id} | Update an existing message template
*MessagingTopicsApi* | [**disableTopicSubscriber**](docs/MessagingTopicsApi.md#disableTopicSubscriber) | **PUT** /messaging/topics/{id}/subscribers/{user_id}/disabled | Enable or disable messages for a user
*MessagingTopicsApi* | [**getTopicSubscriber**](docs/MessagingTopicsApi.md#getTopicSubscriber) | **GET** /messaging/topics/{id}/subscribers/{user_id} | Get a subscriber to a topic
*MessagingTopicsApi* | [**getUserTopics**](docs/MessagingTopicsApi.md#getUserTopics) | **GET** /users/{id}/topics | Get all messaging topics for a given user
*NotificationsApi* | [**createNotificationType**](docs/NotificationsApi.md#createNotificationType) | **POST** /notifications/types | Create a notification type
*NotificationsApi* | [**deleteNotificationType**](docs/NotificationsApi.md#deleteNotificationType) | **DELETE** /notifications/types/{id} | Delete a notification type
*NotificationsApi* | [**getNotificationType**](docs/NotificationsApi.md#getNotificationType) | **GET** /notifications/types/{id} | Get a single notification type
*NotificationsApi* | [**getNotificationTypes**](docs/NotificationsApi.md#getNotificationTypes) | **GET** /notifications/types | List and search notification types
*NotificationsApi* | [**getUserNotificationInfo**](docs/NotificationsApi.md#getUserNotificationInfo) | **GET** /users/{user_id}/notifications/types/{type_id} | View a user&#39;s notification settings for a type
*NotificationsApi* | [**getUserNotificationInfoList**](docs/NotificationsApi.md#getUserNotificationInfoList) | **GET** /users/{user_id}/notifications/types | View a user&#39;s notification settings
*NotificationsApi* | [**getUserNotifications**](docs/NotificationsApi.md#getUserNotifications) | **GET** /users/{id}/notifications | Get notifications
*NotificationsApi* | [**sendNotification**](docs/NotificationsApi.md#sendNotification) | **POST** /notifications | Send a notification
*NotificationsApi* | [**setUserNotificationStatus**](docs/NotificationsApi.md#setUserNotificationStatus) | **PUT** /users/{user_id}/notifications/{notification_id}/status | Set notification status
*NotificationsApi* | [**silenceDirectNotifications**](docs/NotificationsApi.md#silenceDirectNotifications) | **PUT** /users/{user_id}/notifications/types/{type_id}/silenced | Enable or disable direct notifications for a user
*NotificationsApi* | [**updateNotificationType**](docs/NotificationsApi.md#updateNotificationType) | **PUT** /notifications/types/{id} | Update a notificationType
*ObjectsApi* | [**createObjectItem**](docs/ObjectsApi.md#createObjectItem) | **POST** /objects/{template_id} | Create an object
*ObjectsApi* | [**createObjectTemplate**](docs/ObjectsApi.md#createObjectTemplate) | **POST** /objects/templates | Create an object template
*ObjectsApi* | [**deleteObjectItem**](docs/ObjectsApi.md#deleteObjectItem) | **DELETE** /objects/{template_id}/{object_id} | Delete an object
*ObjectsApi* | [**deleteObjectTemplate**](docs/ObjectsApi.md#deleteObjectTemplate) | **DELETE** /objects/templates/{id} | Delete an entitlement template
*ObjectsApi* | [**getObjectItem**](docs/ObjectsApi.md#getObjectItem) | **GET** /objects/{template_id}/{object_id} | Get a single object
*ObjectsApi* | [**getObjectItems**](docs/ObjectsApi.md#getObjectItems) | **GET** /objects/{template_id} | List and search objects
*ObjectsApi* | [**getObjectTemplate**](docs/ObjectsApi.md#getObjectTemplate) | **GET** /objects/templates/{id} | Get a single entitlement template
*ObjectsApi* | [**getObjectTemplates**](docs/ObjectsApi.md#getObjectTemplates) | **GET** /objects/templates | List and search entitlement templates
*ObjectsApi* | [**updateObjectItem**](docs/ObjectsApi.md#updateObjectItem) | **PUT** /objects/{template_id}/{object_id} | Update an object
*ObjectsApi* | [**updateObjectTemplate**](docs/ObjectsApi.md#updateObjectTemplate) | **PUT** /objects/templates/{id} | Update an entitlement template
*PaymentsApi* | [**createPaymentMethod**](docs/PaymentsApi.md#createPaymentMethod) | **POST** /users/{user_id}/payment-methods | Create a new payment method for a user
*PaymentsApi* | [**deletePaymentMethod**](docs/PaymentsApi.md#deletePaymentMethod) | **DELETE** /users/{user_id}/payment-methods/{id} | Delete an existing payment method for a user
*PaymentsApi* | [**getPaymentMethod**](docs/PaymentsApi.md#getPaymentMethod) | **GET** /users/{user_id}/payment-methods/{id} | Get a single payment method for a user
*PaymentsApi* | [**getPaymentMethodType**](docs/PaymentsApi.md#getPaymentMethodType) | **GET** /payment/types/{id} | Get a single payment method type
*PaymentsApi* | [**getPaymentMethodTypes**](docs/PaymentsApi.md#getPaymentMethodTypes) | **GET** /payment/types | Get all payment method types
*PaymentsApi* | [**getPaymentMethods**](docs/PaymentsApi.md#getPaymentMethods) | **GET** /users/{user_id}/payment-methods | Get all payment methods for a user
*PaymentsApi* | [**paymentAuthorization**](docs/PaymentsApi.md#paymentAuthorization) | **POST** /payment/authorizations | Authorize payment of an invoice for later capture
*PaymentsApi* | [**paymentCapture**](docs/PaymentsApi.md#paymentCapture) | **POST** /payment/authorizations/{id}/capture | Capture an existing invoice payment authorization
*PaymentsApi* | [**updatePaymentMethod**](docs/PaymentsApi.md#updatePaymentMethod) | **PUT** /users/{user_id}/payment-methods/{id} | Update an existing payment method for a user
*PaymentsAppleApi* | [**verifyAppleReceipt**](docs/PaymentsAppleApi.md#verifyAppleReceipt) | **POST** /payment/provider/apple/receipt | Pay invoice with Apple receipt
*PaymentsFattMerchantApi* | [**createOrUpdateFattMerchantPaymentMethod**](docs/PaymentsFattMerchantApi.md#createOrUpdateFattMerchantPaymentMethod) | **PUT** /payment/provider/fattmerchant/payment-methods | Create or update a FattMerchant payment method for a user
*PaymentsOptimalApi* | [**silentPostOptimal**](docs/PaymentsOptimalApi.md#silentPostOptimal) | **POST** /payment/provider/optimal/silent | Initiate silent post with Optimal
*PaymentsPayPalClassicApi* | [**createPayPalBillingAgreementUrl**](docs/PaymentsPayPalClassicApi.md#createPayPalBillingAgreementUrl) | **POST** /payment/provider/paypal/classic/agreements/start | Create a PayPal Classic billing agreement for the user
*PaymentsPayPalClassicApi* | [**createPayPalExpressCheckout**](docs/PaymentsPayPalClassicApi.md#createPayPalExpressCheckout) | **POST** /payment/provider/paypal/classic/checkout/start | Create a payment token for PayPal express checkout
*PaymentsPayPalClassicApi* | [**finalizePayPalBillingAgreement**](docs/PaymentsPayPalClassicApi.md#finalizePayPalBillingAgreement) | **POST** /payment/provider/paypal/classic/agreements/finish | Finalizes a billing agreement after the user has accepted through PayPal
*PaymentsPayPalClassicApi* | [**finalizePayPalCheckout**](docs/PaymentsPayPalClassicApi.md#finalizePayPalCheckout) | **POST** /payment/provider/paypal/classic/checkout/finish | Finalizes a payment after the user has completed checkout with PayPal
*PaymentsStripeApi* | [**createStripePaymentMethod**](docs/PaymentsStripeApi.md#createStripePaymentMethod) | **POST** /payment/provider/stripe/payment-methods | Create a Stripe payment method for a user
*PaymentsStripeApi* | [**payStripeInvoice**](docs/PaymentsStripeApi.md#payStripeInvoice) | **POST** /payment/provider/stripe/payments | Pay with a single use token
*PaymentsTransactionsApi* | [**getTransaction**](docs/PaymentsTransactionsApi.md#getTransaction) | **GET** /transactions/{id} | Get the details for a single transaction
*PaymentsTransactionsApi* | [**getTransactions**](docs/PaymentsTransactionsApi.md#getTransactions) | **GET** /transactions | List and search transactions
*PaymentsTransactionsApi* | [**refundTransaction**](docs/PaymentsTransactionsApi.md#refundTransaction) | **POST** /transactions/{id}/refunds | Refund a payment transaction, in full or in part
*PaymentsWalletsApi* | [**getUserWallet**](docs/PaymentsWalletsApi.md#getUserWallet) | **GET** /users/{user_id}/wallets/{currency_code} | Returns the user&#39;s wallet for the given currency code
*PaymentsWalletsApi* | [**getUserWalletTransactions**](docs/PaymentsWalletsApi.md#getUserWalletTransactions) | **GET** /users/{user_id}/wallets/{currency_code}/transactions | Retrieve a user&#39;s wallet transactions
*PaymentsWalletsApi* | [**getUserWallets**](docs/PaymentsWalletsApi.md#getUserWallets) | **GET** /users/{user_id}/wallets | List all of a user&#39;s wallets
*PaymentsWalletsApi* | [**getWalletBalances**](docs/PaymentsWalletsApi.md#getWalletBalances) | **GET** /wallets/totals | Retrieves a summation of wallet balances by currency code
*PaymentsWalletsApi* | [**getWalletTransactions**](docs/PaymentsWalletsApi.md#getWalletTransactions) | **GET** /wallets/transactions | Retrieve wallet transactions across the system
*PaymentsWalletsApi* | [**getWallets**](docs/PaymentsWalletsApi.md#getWallets) | **GET** /wallets | Retrieve a list of wallets across the system
*PaymentsWalletsApi* | [**updateWalletBalance**](docs/PaymentsWalletsApi.md#updateWalletBalance) | **PUT** /users/{user_id}/wallets/{currency_code}/balance | Updates the balance for a user&#39;s wallet
*PaymentsXsollaApi* | [**createXsollaTokenUrl**](docs/PaymentsXsollaApi.md#createXsollaTokenUrl) | **POST** /payment/provider/xsolla/payment | Create a payment token that should be used to forward the user to Xsolla so they can complete payment
*ReportingChallengesApi* | [**getChallengeEventLeaderboard**](docs/ReportingChallengesApi.md#getChallengeEventLeaderboard) | **GET** /reporting/events/leaderboard | Retrieve a challenge event leaderboard details
*ReportingChallengesApi* | [**getChallengeEventParticipants**](docs/ReportingChallengesApi.md#getChallengeEventParticipants) | **GET** /reporting/events/participants | Retrieve a challenge event participant details
*ReportingOrdersApi* | [**getInvoiceReports**](docs/ReportingOrdersApi.md#getInvoiceReports) | **GET** /reporting/orders/count/{currency_code} | Retrieve invoice counts aggregated by time ranges
*ReportingRevenueApi* | [**getItemRevenue**](docs/ReportingRevenueApi.md#getItemRevenue) | **GET** /reporting/revenue/item-sales/{currency_code} | Get item revenue info
*ReportingRevenueApi* | [**getRefundRevenue**](docs/ReportingRevenueApi.md#getRefundRevenue) | **GET** /reporting/revenue/refunds/{currency_code} | Get refund revenue info
*ReportingRevenueApi* | [**getRevenueByCountry**](docs/ReportingRevenueApi.md#getRevenueByCountry) | **GET** /reporting/revenue/countries/{currency_code} | Get revenue info by country
*ReportingRevenueApi* | [**getRevenueByItem**](docs/ReportingRevenueApi.md#getRevenueByItem) | **GET** /reporting/revenue/products/{currency_code} | Get revenue info by item
*ReportingRevenueApi* | [**getSubscriptionRevenue**](docs/ReportingRevenueApi.md#getSubscriptionRevenue) | **GET** /reporting/revenue/subscription-sales/{currency_code} | Get subscription revenue info
*ReportingSubscriptionsApi* | [**getSubscriptionReports**](docs/ReportingSubscriptionsApi.md#getSubscriptionReports) | **GET** /reporting/subscription | Get a list of available subscription reports in most recent first order
*ReportingUsageApi* | [**getUsageByDay**](docs/ReportingUsageApi.md#getUsageByDay) | **GET** /reporting/usage/day | Returns aggregated endpoint usage information by day
*ReportingUsageApi* | [**getUsageByHour**](docs/ReportingUsageApi.md#getUsageByHour) | **GET** /reporting/usage/hour | Returns aggregated endpoint usage information by hour
*ReportingUsageApi* | [**getUsageByMinute**](docs/ReportingUsageApi.md#getUsageByMinute) | **GET** /reporting/usage/minute | Returns aggregated endpoint usage information by minute
*ReportingUsageApi* | [**getUsageByMonth**](docs/ReportingUsageApi.md#getUsageByMonth) | **GET** /reporting/usage/month | Returns aggregated endpoint usage information by month
*ReportingUsageApi* | [**getUsageByYear**](docs/ReportingUsageApi.md#getUsageByYear) | **GET** /reporting/usage/year | Returns aggregated endpoint usage information by year
*ReportingUsageApi* | [**getUsageEndpoints**](docs/ReportingUsageApi.md#getUsageEndpoints) | **GET** /reporting/usage/endpoints | Returns list of endpoints called (method and url)
*ReportingUsersApi* | [**getUserRegistrations**](docs/ReportingUsersApi.md#getUserRegistrations) | **GET** /reporting/users/registrations | Get user registration info
*RuleEngineActionsApi* | [**getBREActions**](docs/RuleEngineActionsApi.md#getBREActions) | **GET** /bre/actions | Get a list of available actions
*RuleEngineEventsApi* | [**sendBREEvent**](docs/RuleEngineEventsApi.md#sendBREEvent) | **POST** /bre/events | Fire a new event, based on an existing trigger
*RuleEngineExpressionsApi* | [**getBREExpression**](docs/RuleEngineExpressionsApi.md#getBREExpression) | **GET** /bre/expressions/{type} | Lookup a specific expression
*RuleEngineExpressionsApi* | [**getBREExpressions**](docs/RuleEngineExpressionsApi.md#getBREExpressions) | **GET** /bre/expressions | Get a list of supported expressions to use in conditions or actions.
*RuleEngineExpressionsApi* | [**getExpressionAsText**](docs/RuleEngineExpressionsApi.md#getExpressionAsText) | **POST** /bre/expressions | Returns the textual representation of an expression
*RuleEngineGlobalsApi* | [**createBREGlobal**](docs/RuleEngineGlobalsApi.md#createBREGlobal) | **POST** /bre/globals/definitions | Create a global definition
*RuleEngineGlobalsApi* | [**deleteBREGlobal**](docs/RuleEngineGlobalsApi.md#deleteBREGlobal) | **DELETE** /bre/globals/definitions/{id} | Delete a global
*RuleEngineGlobalsApi* | [**getBREGlobal**](docs/RuleEngineGlobalsApi.md#getBREGlobal) | **GET** /bre/globals/definitions/{id} | Get a single global definition
*RuleEngineGlobalsApi* | [**getBREGlobals**](docs/RuleEngineGlobalsApi.md#getBREGlobals) | **GET** /bre/globals/definitions | List global definitions
*RuleEngineGlobalsApi* | [**updateBREGlobal**](docs/RuleEngineGlobalsApi.md#updateBREGlobal) | **PUT** /bre/globals/definitions/{id} | Update a global definition
*RuleEngineRulesApi* | [**createBRERule**](docs/RuleEngineRulesApi.md#createBRERule) | **POST** /bre/rules | Create a rule
*RuleEngineRulesApi* | [**deleteBRERule**](docs/RuleEngineRulesApi.md#deleteBRERule) | **DELETE** /bre/rules/{id} | Delete a rule
*RuleEngineRulesApi* | [**getBREExpressionAsString**](docs/RuleEngineRulesApi.md#getBREExpressionAsString) | **POST** /bre/rules/expression-as-string | Returns a string representation of the provided expression
*RuleEngineRulesApi* | [**getBRERule**](docs/RuleEngineRulesApi.md#getBRERule) | **GET** /bre/rules/{id} | Get a single rule
*RuleEngineRulesApi* | [**getBRERules**](docs/RuleEngineRulesApi.md#getBRERules) | **GET** /bre/rules | List rules
*RuleEngineRulesApi* | [**setBRERule**](docs/RuleEngineRulesApi.md#setBRERule) | **PUT** /bre/rules/{id}/enabled | Enable or disable a rule
*RuleEngineRulesApi* | [**updateBRERule**](docs/RuleEngineRulesApi.md#updateBRERule) | **PUT** /bre/rules/{id} | Update a rule
*RuleEngineTriggersApi* | [**createBRETrigger**](docs/RuleEngineTriggersApi.md#createBRETrigger) | **POST** /bre/triggers | Create a trigger
*RuleEngineTriggersApi* | [**deleteBRETrigger**](docs/RuleEngineTriggersApi.md#deleteBRETrigger) | **DELETE** /bre/triggers/{event_name} | Delete a trigger
*RuleEngineTriggersApi* | [**getBRETrigger**](docs/RuleEngineTriggersApi.md#getBRETrigger) | **GET** /bre/triggers/{event_name} | Get a single trigger
*RuleEngineTriggersApi* | [**getBRETriggers**](docs/RuleEngineTriggersApi.md#getBRETriggers) | **GET** /bre/triggers | List triggers
*RuleEngineTriggersApi* | [**updateBRETrigger**](docs/RuleEngineTriggersApi.md#updateBRETrigger) | **PUT** /bre/triggers/{event_name} | Update a trigger
*RuleEngineVariablesApi* | [**getBREVariableTypes**](docs/RuleEngineVariablesApi.md#getBREVariableTypes) | **GET** /bre/variable-types | Get a list of variable types available
*RuleEngineVariablesApi* | [**getBREVariableValues**](docs/RuleEngineVariablesApi.md#getBREVariableValues) | **GET** /bre/variable-types/{name}/values | List valid values for a type
*SearchApi* | [**searchCountGET**](docs/SearchApi.md#searchCountGET) | **GET** /search/count/{type} | Count matches with no template
*SearchApi* | [**searchCountPOST**](docs/SearchApi.md#searchCountPOST) | **POST** /search/count/{type} | Count matches with no template
*SearchApi* | [**searchCountWithTemplateGET**](docs/SearchApi.md#searchCountWithTemplateGET) | **GET** /search/count/{type}/{template} | Count matches with a template
*SearchApi* | [**searchCountWithTemplatePOST**](docs/SearchApi.md#searchCountWithTemplatePOST) | **POST** /search/count/{type}/{template} | Count matches with a template
*SearchApi* | [**searchDocumentGET**](docs/SearchApi.md#searchDocumentGET) | **GET** /search/documents/{type}/{id} | Get document with no template
*SearchApi* | [**searchDocumentWithTemplateGET**](docs/SearchApi.md#searchDocumentWithTemplateGET) | **GET** /search/documents/{type}/{template}/{id} | Get document with a template
*SearchApi* | [**searchExplainGET**](docs/SearchApi.md#searchExplainGET) | **GET** /search/explain/{type}/{id} | Explain matches with no template
*SearchApi* | [**searchExplainPOST**](docs/SearchApi.md#searchExplainPOST) | **POST** /search/explain/{type}/{id} | Explain matches with no template
*SearchApi* | [**searchExplainWithTemplateGET**](docs/SearchApi.md#searchExplainWithTemplateGET) | **GET** /search/explain/{type}/{template}/{id} | Explain matches with a template
*SearchApi* | [**searchExplainWithTemplatePOST**](docs/SearchApi.md#searchExplainWithTemplatePOST) | **POST** /search/explain/{type}/{template}/{id} | Explain matches with a template
*SearchApi* | [**searchIndex**](docs/SearchApi.md#searchIndex) | **POST** /search/index/{type} | Search an index with no template
*SearchApi* | [**searchIndexGET**](docs/SearchApi.md#searchIndexGET) | **GET** /search/index/{type} | Search an index with no template
*SearchApi* | [**searchIndexWithTemplateGET**](docs/SearchApi.md#searchIndexWithTemplateGET) | **GET** /search/index/{type}/{template} | Search an index with a template
*SearchApi* | [**searchIndexWithTemplatePOST**](docs/SearchApi.md#searchIndexWithTemplatePOST) | **POST** /search/index/{type}/{template} | Search an index with a template
*SearchApi* | [**searchIndicesGET**](docs/SearchApi.md#searchIndicesGET) | **GET** /search/indices | Get indices
*SearchApi* | [**searchMappingsGET**](docs/SearchApi.md#searchMappingsGET) | **GET** /search/mappings/{type} | Get mapping with no template
*SearchApi* | [**searchMappingsWithTemplateGET**](docs/SearchApi.md#searchMappingsWithTemplateGET) | **GET** /search/mappings/{type}/{template} | Get mapping with a template
*SearchApi* | [**searchValidateGET**](docs/SearchApi.md#searchValidateGET) | **GET** /search/validate/{type} | Validate matches with no template
*SearchApi* | [**searchValidatePOST**](docs/SearchApi.md#searchValidatePOST) | **POST** /search/validate/{type} | Validate matches with no template
*SearchApi* | [**searchValidateWithTemplateGET**](docs/SearchApi.md#searchValidateWithTemplateGET) | **GET** /search/validate/{type}/{template} | Validate matches with a template
*SearchApi* | [**searchValidateWithTemplatePOST**](docs/SearchApi.md#searchValidateWithTemplatePOST) | **POST** /search/validate/{type}/{template} | Validate matches with a template
*SocialFacebookApi* | [**linkAccounts**](docs/SocialFacebookApi.md#linkAccounts) | **POST** /social/facebook/users | Link facebook account
*SocialGoogleApi* | [**linkAccounts1**](docs/SocialGoogleApi.md#linkAccounts1) | **POST** /social/google/users | Link google account
*StoreApi* | [**createItemTemplate**](docs/StoreApi.md#createItemTemplate) | **POST** /store/items/templates | Create an item template
*StoreApi* | [**createStoreItem**](docs/StoreApi.md#createStoreItem) | **POST** /store/items | Create a store item
*StoreApi* | [**deleteItemTemplate**](docs/StoreApi.md#deleteItemTemplate) | **DELETE** /store/items/templates/{id} | Delete an item template
*StoreApi* | [**deleteStoreItem**](docs/StoreApi.md#deleteStoreItem) | **DELETE** /store/items/{id} | Delete a store item
*StoreApi* | [**getBehaviors**](docs/StoreApi.md#getBehaviors) | **GET** /store/items/behaviors | List available item behaviors
*StoreApi* | [**getItemTemplate**](docs/StoreApi.md#getItemTemplate) | **GET** /store/items/templates/{id} | Get a single item template
*StoreApi* | [**getItemTemplates**](docs/StoreApi.md#getItemTemplates) | **GET** /store/items/templates | List and search item templates
*StoreApi* | [**getStoreItem**](docs/StoreApi.md#getStoreItem) | **GET** /store/items/{id} | Get a single store item
*StoreApi* | [**getStoreItems**](docs/StoreApi.md#getStoreItems) | **GET** /store/items | List and search store items
*StoreApi* | [**quickBuy**](docs/StoreApi.md#quickBuy) | **POST** /store/quick-buy | One-step purchase and pay for a single SKU item from a user&#39;s wallet
*StoreApi* | [**updateItemTemplate**](docs/StoreApi.md#updateItemTemplate) | **PUT** /store/items/templates/{id} | Update an item template
*StoreApi* | [**updateStoreItem**](docs/StoreApi.md#updateStoreItem) | **PUT** /store/items/{id} | Update a store item
*StoreBundlesApi* | [**createBundleItem**](docs/StoreBundlesApi.md#createBundleItem) | **POST** /store/bundles | Create a bundle item
*StoreBundlesApi* | [**createBundleTemplate**](docs/StoreBundlesApi.md#createBundleTemplate) | **POST** /store/bundles/templates | Create a bundle template
*StoreBundlesApi* | [**deleteBundleItem**](docs/StoreBundlesApi.md#deleteBundleItem) | **DELETE** /store/bundles/{id} | Delete a bundle item
*StoreBundlesApi* | [**deleteBundleTemplate**](docs/StoreBundlesApi.md#deleteBundleTemplate) | **DELETE** /store/bundles/templates/{id} | Delete a bundle template
*StoreBundlesApi* | [**getBundleItem**](docs/StoreBundlesApi.md#getBundleItem) | **GET** /store/bundles/{id} | Get a single bundle item
*StoreBundlesApi* | [**getBundleTemplate**](docs/StoreBundlesApi.md#getBundleTemplate) | **GET** /store/bundles/templates/{id} | Get a single bundle template
*StoreBundlesApi* | [**getBundleTemplates**](docs/StoreBundlesApi.md#getBundleTemplates) | **GET** /store/bundles/templates | List and search bundle templates
*StoreBundlesApi* | [**updateBundleItem**](docs/StoreBundlesApi.md#updateBundleItem) | **PUT** /store/bundles/{id} | Update a bundle item
*StoreBundlesApi* | [**updateBundleTemplate**](docs/StoreBundlesApi.md#updateBundleTemplate) | **PUT** /store/bundles/templates/{id} | Update a bundle template
*StoreCouponsApi* | [**createCouponItem**](docs/StoreCouponsApi.md#createCouponItem) | **POST** /store/coupons | Create a coupon item
*StoreCouponsApi* | [**createCouponTemplate**](docs/StoreCouponsApi.md#createCouponTemplate) | **POST** /store/coupons/templates | Create a coupon template
*StoreCouponsApi* | [**deleteCouponItem**](docs/StoreCouponsApi.md#deleteCouponItem) | **DELETE** /store/coupons/{id} | Delete a coupon item
*StoreCouponsApi* | [**deleteCouponTemplate**](docs/StoreCouponsApi.md#deleteCouponTemplate) | **DELETE** /store/coupons/templates/{id} | Delete a coupon template
*StoreCouponsApi* | [**getCouponItem**](docs/StoreCouponsApi.md#getCouponItem) | **GET** /store/coupons/{id} | Get a single coupon item
*StoreCouponsApi* | [**getCouponItemBySku**](docs/StoreCouponsApi.md#getCouponItemBySku) | **GET** /store/coupons/skus/{sku} | Get a coupon by sku
*StoreCouponsApi* | [**getCouponTemplate**](docs/StoreCouponsApi.md#getCouponTemplate) | **GET** /store/coupons/templates/{id} | Get a single coupon template
*StoreCouponsApi* | [**getCouponTemplates**](docs/StoreCouponsApi.md#getCouponTemplates) | **GET** /store/coupons/templates | List and search coupon templates
*StoreCouponsApi* | [**updateCouponItem**](docs/StoreCouponsApi.md#updateCouponItem) | **PUT** /store/coupons/{id} | Update a coupon item
*StoreCouponsApi* | [**updateCouponTemplate**](docs/StoreCouponsApi.md#updateCouponTemplate) | **PUT** /store/coupons/templates/{id} | Update a coupon template
*StoreSalesApi* | [**createCatalogSale**](docs/StoreSalesApi.md#createCatalogSale) | **POST** /store/sales | Create a sale
*StoreSalesApi* | [**deleteCatalogSale**](docs/StoreSalesApi.md#deleteCatalogSale) | **DELETE** /store/sales/{id} | Delete a sale
*StoreSalesApi* | [**getCatalogSale**](docs/StoreSalesApi.md#getCatalogSale) | **GET** /store/sales/{id} | Get a single sale
*StoreSalesApi* | [**getCatalogSales**](docs/StoreSalesApi.md#getCatalogSales) | **GET** /store/sales | List and search sales
*StoreSalesApi* | [**updateCatalogSale**](docs/StoreSalesApi.md#updateCatalogSale) | **PUT** /store/sales/{id} | Update a sale
*StoreShippingApi* | [**createShippingItem**](docs/StoreShippingApi.md#createShippingItem) | **POST** /store/shipping | Create a shipping item
*StoreShippingApi* | [**createShippingTemplate**](docs/StoreShippingApi.md#createShippingTemplate) | **POST** /store/shipping/templates | Create a shipping template
*StoreShippingApi* | [**deleteShippingItem**](docs/StoreShippingApi.md#deleteShippingItem) | **DELETE** /store/shipping/{id} | Delete a shipping item
*StoreShippingApi* | [**deleteShippingTemplate**](docs/StoreShippingApi.md#deleteShippingTemplate) | **DELETE** /store/shipping/templates/{id} | Delete a shipping template
*StoreShippingApi* | [**getShippingItem**](docs/StoreShippingApi.md#getShippingItem) | **GET** /store/shipping/{id} | Get a single shipping item
*StoreShippingApi* | [**getShippingTemplate**](docs/StoreShippingApi.md#getShippingTemplate) | **GET** /store/shipping/templates/{id} | Get a single shipping template
*StoreShippingApi* | [**getShippingTemplates**](docs/StoreShippingApi.md#getShippingTemplates) | **GET** /store/shipping/templates | List and search shipping templates
*StoreShippingApi* | [**updateShippingItem**](docs/StoreShippingApi.md#updateShippingItem) | **PUT** /store/shipping/{id} | Update a shipping item
*StoreShippingApi* | [**updateShippingTemplate**](docs/StoreShippingApi.md#updateShippingTemplate) | **PUT** /store/shipping/templates/{id} | Update a shipping template
*StoreShoppingCartsApi* | [**addCustomDiscount**](docs/StoreShoppingCartsApi.md#addCustomDiscount) | **POST** /carts/{id}/custom-discounts | Adds a custom discount to the cart
*StoreShoppingCartsApi* | [**addDiscountToCart**](docs/StoreShoppingCartsApi.md#addDiscountToCart) | **POST** /carts/{id}/discounts | Adds a discount coupon to the cart
*StoreShoppingCartsApi* | [**addItemToCart**](docs/StoreShoppingCartsApi.md#addItemToCart) | **POST** /carts/{id}/items | Add an item to the cart
*StoreShoppingCartsApi* | [**createCart**](docs/StoreShoppingCartsApi.md#createCart) | **POST** /carts | Create a cart
*StoreShoppingCartsApi* | [**getCart**](docs/StoreShoppingCartsApi.md#getCart) | **GET** /carts/{id} | Returns the cart with the given GUID
*StoreShoppingCartsApi* | [**getCarts**](docs/StoreShoppingCartsApi.md#getCarts) | **GET** /carts | Get a list of carts
*StoreShoppingCartsApi* | [**getShippable**](docs/StoreShoppingCartsApi.md#getShippable) | **GET** /carts/{id}/shippable | Returns whether a cart requires shipping
*StoreShoppingCartsApi* | [**getShippingCountries**](docs/StoreShoppingCartsApi.md#getShippingCountries) | **GET** /carts/{id}/countries | Get the list of available shipping countries per vendor
*StoreShoppingCartsApi* | [**removeDiscountFromCart**](docs/StoreShoppingCartsApi.md#removeDiscountFromCart) | **DELETE** /carts/{id}/discounts/{code} | Removes a discount coupon from the cart
*StoreShoppingCartsApi* | [**setCartCurrency**](docs/StoreShoppingCartsApi.md#setCartCurrency) | **PUT** /carts/{id}/currency | Sets the currency to use for the cart
*StoreShoppingCartsApi* | [**setCartOwner**](docs/StoreShoppingCartsApi.md#setCartOwner) | **PUT** /carts/{id}/owner | Sets the owner of a cart if none is set already
*StoreShoppingCartsApi* | [**updateItemInCart**](docs/StoreShoppingCartsApi.md#updateItemInCart) | **PUT** /carts/{id}/items | Changes the quantity of an item already in the cart
*StoreShoppingCartsApi* | [**updateShippingAddress**](docs/StoreShoppingCartsApi.md#updateShippingAddress) | **PUT** /carts/{id}/shipping-address | Modifies or sets the order shipping address
*StoreSubscriptionsApi* | [**createSubscription**](docs/StoreSubscriptionsApi.md#createSubscription) | **POST** /subscriptions | Creates a subscription item and associated plans
*StoreSubscriptionsApi* | [**createSubscriptionTemplate**](docs/StoreSubscriptionsApi.md#createSubscriptionTemplate) | **POST** /subscriptions/templates | Create a subscription template
*StoreSubscriptionsApi* | [**deleteSubscription**](docs/StoreSubscriptionsApi.md#deleteSubscription) | **DELETE** /subscriptions/{id}/plans/{plan_id} | Delete a subscription plan
*StoreSubscriptionsApi* | [**deleteSubscriptionTemplate**](docs/StoreSubscriptionsApi.md#deleteSubscriptionTemplate) | **DELETE** /subscriptions/templates/{id} | Delete a subscription template
*StoreSubscriptionsApi* | [**getSubscription**](docs/StoreSubscriptionsApi.md#getSubscription) | **GET** /subscriptions/{id} | Retrieve a single subscription item and associated plans
*StoreSubscriptionsApi* | [**getSubscriptionTemplate**](docs/StoreSubscriptionsApi.md#getSubscriptionTemplate) | **GET** /subscriptions/templates/{id} | Get a single subscription template
*StoreSubscriptionsApi* | [**getSubscriptionTemplates**](docs/StoreSubscriptionsApi.md#getSubscriptionTemplates) | **GET** /subscriptions/templates | List and search subscription templates
*StoreSubscriptionsApi* | [**getSubscriptions**](docs/StoreSubscriptionsApi.md#getSubscriptions) | **GET** /subscriptions | List available subscription items and associated plans
*StoreSubscriptionsApi* | [**processSubscriptions**](docs/StoreSubscriptionsApi.md#processSubscriptions) | **POST** /subscriptions/process | Processes subscriptions and charge dues
*StoreSubscriptionsApi* | [**updateSubscription**](docs/StoreSubscriptionsApi.md#updateSubscription) | **PUT** /subscriptions/{id} | Updates a subscription item and associated plans
*StoreSubscriptionsApi* | [**updateSubscriptionTemplate**](docs/StoreSubscriptionsApi.md#updateSubscriptionTemplate) | **PUT** /subscriptions/templates/{id} | Update a subscription template
*StoreVendorsApi* | [**createVendor**](docs/StoreVendorsApi.md#createVendor) | **POST** /vendors | Create a vendor
*StoreVendorsApi* | [**createVendorTemplate**](docs/StoreVendorsApi.md#createVendorTemplate) | **POST** /vendors/templates | Create a vendor template
*StoreVendorsApi* | [**deleteVendor**](docs/StoreVendorsApi.md#deleteVendor) | **DELETE** /vendors/{id} | Delete a vendor
*StoreVendorsApi* | [**deleteVendorTemplate**](docs/StoreVendorsApi.md#deleteVendorTemplate) | **DELETE** /vendors/templates/{id} | Delete a vendor template
*StoreVendorsApi* | [**getVendor**](docs/StoreVendorsApi.md#getVendor) | **GET** /vendors/{id} | Get a single vendor
*StoreVendorsApi* | [**getVendorTemplate**](docs/StoreVendorsApi.md#getVendorTemplate) | **GET** /vendors/templates/{id} | Get a single vendor template
*StoreVendorsApi* | [**getVendorTemplates**](docs/StoreVendorsApi.md#getVendorTemplates) | **GET** /vendors/templates | List and search vendor templates
*StoreVendorsApi* | [**getVendors**](docs/StoreVendorsApi.md#getVendors) | **GET** /vendors | List and search vendors
*StoreVendorsApi* | [**updateVendor**](docs/StoreVendorsApi.md#updateVendor) | **PUT** /vendors/{id} | Update a vendor
*StoreVendorsApi* | [**updateVendorTemplate**](docs/StoreVendorsApi.md#updateVendorTemplate) | **PUT** /vendors/templates/{id} | Update a vendor template
*TaxesApi* | [**createCountryTax**](docs/TaxesApi.md#createCountryTax) | **POST** /tax/countries | Create a country tax
*TaxesApi* | [**createStateTax**](docs/TaxesApi.md#createStateTax) | **POST** /tax/countries/{country_code_iso3}/states | Create a state tax
*TaxesApi* | [**deleteCountryTax**](docs/TaxesApi.md#deleteCountryTax) | **DELETE** /tax/countries/{country_code_iso3} | Delete an existing tax
*TaxesApi* | [**deleteStateTax**](docs/TaxesApi.md#deleteStateTax) | **DELETE** /tax/countries/{country_code_iso3}/states/{state_code} | Delete an existing state tax
*TaxesApi* | [**getCountryTax**](docs/TaxesApi.md#getCountryTax) | **GET** /tax/countries/{country_code_iso3} | Get a single tax
*TaxesApi* | [**getCountryTaxes**](docs/TaxesApi.md#getCountryTaxes) | **GET** /tax/countries | List and search taxes
*TaxesApi* | [**getStateTax**](docs/TaxesApi.md#getStateTax) | **GET** /tax/countries/{country_code_iso3}/states/{state_code} | Get a single state tax
*TaxesApi* | [**getStateTaxesForCountries**](docs/TaxesApi.md#getStateTaxesForCountries) | **GET** /tax/states | List and search taxes across all countries
*TaxesApi* | [**getStateTaxesForCountry**](docs/TaxesApi.md#getStateTaxesForCountry) | **GET** /tax/countries/{country_code_iso3}/states | List and search taxes within a country
*TaxesApi* | [**updateCountryTax**](docs/TaxesApi.md#updateCountryTax) | **PUT** /tax/countries/{country_code_iso3} | Create or update a tax
*TaxesApi* | [**updateStateTax**](docs/TaxesApi.md#updateStateTax) | **PUT** /tax/countries/{country_code_iso3}/states/{state_code} | Create or update a state tax
*TemplatesPropertiesApi* | [**getTemplatePropertyType**](docs/TemplatesPropertiesApi.md#getTemplatePropertyType) | **GET** /templates/properties/{type} | Get details for a template property type
*TemplatesPropertiesApi* | [**getTemplatePropertyTypes**](docs/TemplatesPropertiesApi.md#getTemplatePropertyTypes) | **GET** /templates/properties | List template property types
*UsersApi* | [**addUserTag**](docs/UsersApi.md#addUserTag) | **POST** /users/{user_id}/tags | Add a tag to a user
*UsersApi* | [**createUserTemplate**](docs/UsersApi.md#createUserTemplate) | **POST** /users/templates | Create a user template
*UsersApi* | [**deleteUserTemplate**](docs/UsersApi.md#deleteUserTemplate) | **DELETE** /users/templates/{id} | Delete a user template
*UsersApi* | [**getDirectMessages1**](docs/UsersApi.md#getDirectMessages1) | **GET** /users/{recipient_id}/messages | Get a list of direct messages with this user
*UsersApi* | [**getUser**](docs/UsersApi.md#getUser) | **GET** /users/{id} | Get a single user
*UsersApi* | [**getUserTags**](docs/UsersApi.md#getUserTags) | **GET** /users/{user_id}/tags | List tags for a user
*UsersApi* | [**getUserTemplate**](docs/UsersApi.md#getUserTemplate) | **GET** /users/templates/{id} | Get a single user template
*UsersApi* | [**getUserTemplates**](docs/UsersApi.md#getUserTemplates) | **GET** /users/templates | List and search user templates
*UsersApi* | [**getUsers**](docs/UsersApi.md#getUsers) | **GET** /users | List and search users
*UsersApi* | [**passwordReset**](docs/UsersApi.md#passwordReset) | **PUT** /users/{id}/password-reset | Choose a new password after a reset
*UsersApi* | [**postUserMessage**](docs/UsersApi.md#postUserMessage) | **POST** /users/{recipient_id}/messages | Send a user message
*UsersApi* | [**registerUser**](docs/UsersApi.md#registerUser) | **POST** /users | Register a new user
*UsersApi* | [**removeUserTag**](docs/UsersApi.md#removeUserTag) | **DELETE** /users/{user_id}/tags/{tag} | Remove a tag from a user
*UsersApi* | [**setPassword**](docs/UsersApi.md#setPassword) | **PUT** /users/{id}/password | Set a user&#39;s password
*UsersApi* | [**startPasswordReset**](docs/UsersApi.md#startPasswordReset) | **POST** /users/{id}/password-reset | Reset a user&#39;s password
*UsersApi* | [**submitPasswordReset**](docs/UsersApi.md#submitPasswordReset) | **POST** /users/password-reset | Reset a user&#39;s password without user id
*UsersApi* | [**updateUser**](docs/UsersApi.md#updateUser) | **PUT** /users/{id} | Update a user
*UsersApi* | [**updateUserTemplate**](docs/UsersApi.md#updateUserTemplate) | **PUT** /users/templates/{id} | Update a user template
*UsersAddressesApi* | [**createAddress**](docs/UsersAddressesApi.md#createAddress) | **POST** /users/{user_id}/addresses | Create a new address
*UsersAddressesApi* | [**deleteAddress**](docs/UsersAddressesApi.md#deleteAddress) | **DELETE** /users/{user_id}/addresses/{id} | Delete an address
*UsersAddressesApi* | [**getAddress**](docs/UsersAddressesApi.md#getAddress) | **GET** /users/{user_id}/addresses/{id} | Get a single address
*UsersAddressesApi* | [**getAddresses**](docs/UsersAddressesApi.md#getAddresses) | **GET** /users/{user_id}/addresses | List and search addresses
*UsersAddressesApi* | [**updateAddress**](docs/UsersAddressesApi.md#updateAddress) | **PUT** /users/{user_id}/addresses/{id} | Update an address
*UsersFriendshipsApi* | [**addFriend**](docs/UsersFriendshipsApi.md#addFriend) | **POST** /users/{user_id}/friends/{id} | Add a friend
*UsersFriendshipsApi* | [**getFriends**](docs/UsersFriendshipsApi.md#getFriends) | **GET** /users/{user_id}/friends | Get friends list
*UsersFriendshipsApi* | [**getInviteToken**](docs/UsersFriendshipsApi.md#getInviteToken) | **GET** /users/{user_id}/invite-token | Returns the invite token
*UsersFriendshipsApi* | [**getInvites**](docs/UsersFriendshipsApi.md#getInvites) | **GET** /users/{user_id}/invites | Get pending invites
*UsersFriendshipsApi* | [**redeemFriendshipToken**](docs/UsersFriendshipsApi.md#redeemFriendshipToken) | **POST** /users/{user_id}/friends/tokens | Redeem friendship token
*UsersFriendshipsApi* | [**removeOrDeclineFriend**](docs/UsersFriendshipsApi.md#removeOrDeclineFriend) | **DELETE** /users/{user_id}/friends/{id} | Remove or decline a friend
*UsersGroupsApi* | [**addMemberToGroup**](docs/UsersGroupsApi.md#addMemberToGroup) | **POST** /users/groups/{unique_name}/members | Adds a new member to the group
*UsersGroupsApi* | [**addMembersToGroup**](docs/UsersGroupsApi.md#addMembersToGroup) | **POST** /users/groups/{unique_name}/members/batch-add | Adds multiple members to the group
*UsersGroupsApi* | [**createGroup**](docs/UsersGroupsApi.md#createGroup) | **POST** /users/groups | Create a group
*UsersGroupsApi* | [**createGroupMemberTemplate**](docs/UsersGroupsApi.md#createGroupMemberTemplate) | **POST** /users/groups/members/templates | Create an group member template
*UsersGroupsApi* | [**createGroupTemplate**](docs/UsersGroupsApi.md#createGroupTemplate) | **POST** /users/groups/templates | Create a group template
*UsersGroupsApi* | [**deleteGroup**](docs/UsersGroupsApi.md#deleteGroup) | **DELETE** /users/groups/{unique_name} | Removes a group from the system
*UsersGroupsApi* | [**deleteGroupMemberTemplate**](docs/UsersGroupsApi.md#deleteGroupMemberTemplate) | **DELETE** /users/groups/members/templates/{id} | Delete an group member template
*UsersGroupsApi* | [**deleteGroupTemplate**](docs/UsersGroupsApi.md#deleteGroupTemplate) | **DELETE** /users/groups/templates/{id} | Delete a group template
*UsersGroupsApi* | [**disableGroupNotification**](docs/UsersGroupsApi.md#disableGroupNotification) | **PUT** /users/groups/{unique_name}/members/{user_id}/messages/disabled | Enable or disable notification of group messages
*UsersGroupsApi* | [**getGroup**](docs/UsersGroupsApi.md#getGroup) | **GET** /users/groups/{unique_name} | Loads a specific group&#39;s details
*UsersGroupsApi* | [**getGroupAncestors**](docs/UsersGroupsApi.md#getGroupAncestors) | **GET** /users/groups/{unique_name}/ancestors | Get group ancestors
*UsersGroupsApi* | [**getGroupMember**](docs/UsersGroupsApi.md#getGroupMember) | **GET** /users/groups/{unique_name}/members/{user_id} | Get a user from a group
*UsersGroupsApi* | [**getGroupMemberTemplate**](docs/UsersGroupsApi.md#getGroupMemberTemplate) | **GET** /users/groups/members/templates/{id} | Get a single group member template
*UsersGroupsApi* | [**getGroupMemberTemplates**](docs/UsersGroupsApi.md#getGroupMemberTemplates) | **GET** /users/groups/members/templates | List and search group member templates
*UsersGroupsApi* | [**getGroupMembers**](docs/UsersGroupsApi.md#getGroupMembers) | **GET** /users/groups/{unique_name}/members | Lists members of the group
*UsersGroupsApi* | [**getGroupMessages**](docs/UsersGroupsApi.md#getGroupMessages) | **GET** /users/groups/{unique_name}/messages | Get a list of group messages
*UsersGroupsApi* | [**getGroupTemplate**](docs/UsersGroupsApi.md#getGroupTemplate) | **GET** /users/groups/templates/{id} | Get a single group template
*UsersGroupsApi* | [**getGroupTemplates**](docs/UsersGroupsApi.md#getGroupTemplates) | **GET** /users/groups/templates | List and search group templates
*UsersGroupsApi* | [**getGroupsForUser**](docs/UsersGroupsApi.md#getGroupsForUser) | **GET** /users/{user_id}/groups | List groups a user is in
*UsersGroupsApi* | [**listGroups**](docs/UsersGroupsApi.md#listGroups) | **GET** /users/groups | List and search groups
*UsersGroupsApi* | [**postGroupMessage**](docs/UsersGroupsApi.md#postGroupMessage) | **POST** /users/groups/{unique_name}/messages | Send a group message
*UsersGroupsApi* | [**removeGroupMember**](docs/UsersGroupsApi.md#removeGroupMember) | **DELETE** /users/groups/{unique_name}/members/{user_id} | Removes a user from a group
*UsersGroupsApi* | [**updateGroup**](docs/UsersGroupsApi.md#updateGroup) | **PUT** /users/groups/{unique_name} | Update a group
*UsersGroupsApi* | [**updateGroupMemberProperties**](docs/UsersGroupsApi.md#updateGroupMemberProperties) | **PUT** /users/groups/{unique_name}/members/{user_id}/order | Change a user&#39;s order
*UsersGroupsApi* | [**updateGroupMemberProperties1**](docs/UsersGroupsApi.md#updateGroupMemberProperties1) | **PUT** /users/groups/{unique_name}/members/{user_id}/properties | Change a user&#39;s membership properties
*UsersGroupsApi* | [**updateGroupMemberStatus**](docs/UsersGroupsApi.md#updateGroupMemberStatus) | **PUT** /users/groups/{unique_name}/members/{user_id}/status | Change a user&#39;s status
*UsersGroupsApi* | [**updateGroupMemberTemplate**](docs/UsersGroupsApi.md#updateGroupMemberTemplate) | **PUT** /users/groups/members/templates/{id} | Update an group member template
*UsersGroupsApi* | [**updateGroupTemplate**](docs/UsersGroupsApi.md#updateGroupTemplate) | **PUT** /users/groups/templates/{id} | Update a group template
*UsersInventoryApi* | [**addItemToUserInventory**](docs/UsersInventoryApi.md#addItemToUserInventory) | **POST** /users/{id}/inventory | Adds an item to the user inventory
*UsersInventoryApi* | [**checkUserEntitlementItem**](docs/UsersInventoryApi.md#checkUserEntitlementItem) | **GET** /users/{user_id}/entitlements/{item_id}/check | Check for access to an item without consuming
*UsersInventoryApi* | [**createEntitlementItem**](docs/UsersInventoryApi.md#createEntitlementItem) | **POST** /entitlements | Create an entitlement item
*UsersInventoryApi* | [**createEntitlementTemplate**](docs/UsersInventoryApi.md#createEntitlementTemplate) | **POST** /entitlements/templates | Create an entitlement template
*UsersInventoryApi* | [**deleteEntitlementItem**](docs/UsersInventoryApi.md#deleteEntitlementItem) | **DELETE** /entitlements/{entitlement_id} | Delete an entitlement item
*UsersInventoryApi* | [**deleteEntitlementTemplate**](docs/UsersInventoryApi.md#deleteEntitlementTemplate) | **DELETE** /entitlements/templates/{id} | Delete an entitlement template
*UsersInventoryApi* | [**getEntitlementItem**](docs/UsersInventoryApi.md#getEntitlementItem) | **GET** /entitlements/{entitlement_id} | Get a single entitlement item
*UsersInventoryApi* | [**getEntitlementItems**](docs/UsersInventoryApi.md#getEntitlementItems) | **GET** /entitlements | List and search entitlement items
*UsersInventoryApi* | [**getEntitlementTemplate**](docs/UsersInventoryApi.md#getEntitlementTemplate) | **GET** /entitlements/templates/{id} | Get a single entitlement template
*UsersInventoryApi* | [**getEntitlementTemplates**](docs/UsersInventoryApi.md#getEntitlementTemplates) | **GET** /entitlements/templates | List and search entitlement templates
*UsersInventoryApi* | [**getUserInventories**](docs/UsersInventoryApi.md#getUserInventories) | **GET** /users/{id}/inventory | List the user inventory entries for a given user
*UsersInventoryApi* | [**getUserInventory**](docs/UsersInventoryApi.md#getUserInventory) | **GET** /users/{user_id}/inventory/{id} | Get an inventory entry
*UsersInventoryApi* | [**getUserInventoryLog**](docs/UsersInventoryApi.md#getUserInventoryLog) | **GET** /users/{user_id}/inventory/{id}/log | List the log entries for this inventory entry
*UsersInventoryApi* | [**getUsersInventory**](docs/UsersInventoryApi.md#getUsersInventory) | **GET** /inventories | List the user inventory entries for all users
*UsersInventoryApi* | [**grantUserEntitlement**](docs/UsersInventoryApi.md#grantUserEntitlement) | **POST** /users/{user_id}/entitlements | Grant an entitlement
*UsersInventoryApi* | [**updateEntitlementItem**](docs/UsersInventoryApi.md#updateEntitlementItem) | **PUT** /entitlements/{entitlement_id} | Update an entitlement item
*UsersInventoryApi* | [**updateEntitlementTemplate**](docs/UsersInventoryApi.md#updateEntitlementTemplate) | **PUT** /entitlements/templates/{id} | Update an entitlement template
*UsersInventoryApi* | [**updateUserInventoryBehaviorData**](docs/UsersInventoryApi.md#updateUserInventoryBehaviorData) | **PUT** /users/{user_id}/inventory/{id}/behavior-data | Set the behavior data for an inventory entry
*UsersInventoryApi* | [**updateUserInventoryExpires**](docs/UsersInventoryApi.md#updateUserInventoryExpires) | **PUT** /users/{user_id}/inventory/{id}/expires | Set the expiration date
*UsersInventoryApi* | [**updateUserInventoryStatus**](docs/UsersInventoryApi.md#updateUserInventoryStatus) | **PUT** /users/{user_id}/inventory/{id}/status | Set the status for an inventory entry
*UsersInventoryApi* | [**useUserEntitlementItem**](docs/UsersInventoryApi.md#useUserEntitlementItem) | **POST** /users/{user_id}/entitlements/{item_id}/use | Use an item
*UsersRelationshipsApi* | [**createUserRelationship**](docs/UsersRelationshipsApi.md#createUserRelationship) | **POST** /users/relationships | Create a user relationship
*UsersRelationshipsApi* | [**deleteUserRelationship**](docs/UsersRelationshipsApi.md#deleteUserRelationship) | **DELETE** /users/relationships/{id} | Delete a user relationship
*UsersRelationshipsApi* | [**getUserRelationship**](docs/UsersRelationshipsApi.md#getUserRelationship) | **GET** /users/relationships/{id} | Get a user relationship
*UsersRelationshipsApi* | [**getUserRelationships**](docs/UsersRelationshipsApi.md#getUserRelationships) | **GET** /users/relationships | Get a list of user relationships
*UsersRelationshipsApi* | [**updateUserRelationship**](docs/UsersRelationshipsApi.md#updateUserRelationship) | **PUT** /users/relationships/{id} | Update a user relationship
*UsersSubscriptionsApi* | [**getUserSubscriptionDetails**](docs/UsersSubscriptionsApi.md#getUserSubscriptionDetails) | **GET** /users/{user_id}/subscriptions/{inventory_id} | Get details about a user&#39;s subscription
*UsersSubscriptionsApi* | [**getUsersSubscriptionDetails**](docs/UsersSubscriptionsApi.md#getUsersSubscriptionDetails) | **GET** /users/{user_id}/subscriptions | Get details about a user&#39;s subscriptions
*UsersSubscriptionsApi* | [**reactivateUserSubscription**](docs/UsersSubscriptionsApi.md#reactivateUserSubscription) | **POST** /users/{user_id}/subscriptions/{inventory_id}/reactivate | Reactivate a subscription and charge fee
*UsersSubscriptionsApi* | [**setSubscriptionBillDate**](docs/UsersSubscriptionsApi.md#setSubscriptionBillDate) | **PUT** /users/{user_id}/subscriptions/{inventory_id}/bill-date | Set a new date to bill a subscription on
*UsersSubscriptionsApi* | [**setSubscriptionPaymentMethod**](docs/UsersSubscriptionsApi.md#setSubscriptionPaymentMethod) | **PUT** /users/{user_id}/subscriptions/{inventory_id}/payment-method | Set the payment method to use for a subscription
*UsersSubscriptionsApi* | [**setSubscriptionStatus**](docs/UsersSubscriptionsApi.md#setSubscriptionStatus) | **PUT** /users/{user_id}/subscriptions/{inventory_id}/status | Set the status of a subscription
*UsersSubscriptionsApi* | [**setUserSubscriptionPlan**](docs/UsersSubscriptionsApi.md#setUserSubscriptionPlan) | **PUT** /users/{user_id}/subscriptions/{inventory_id}/plan | Set a new subscription plan for a user
*UsersSubscriptionsApi* | [**setUserSubscriptionPrice**](docs/UsersSubscriptionsApi.md#setUserSubscriptionPrice) | **PUT** /users/{user_id}/subscriptions/{inventory_id}/price-override | Set a new subscription price for a user
*UtilBatchApi* | [**getBatch**](docs/UtilBatchApi.md#getBatch) | **GET** /batch/{token} | Get batch result with token
*UtilBatchApi* | [**sendBatch**](docs/UtilBatchApi.md#sendBatch) | **POST** /batch | Request to run API call given the method, content type, path url, and body of request
*UtilHealthApi* | [**getHealth**](docs/UtilHealthApi.md#getHealth) | **GET** /health | Get health info
*UtilMaintenanceApi* | [**deleteMaintenance**](docs/UtilMaintenanceApi.md#deleteMaintenance) | **DELETE** /maintenance | Delete maintenance info
*UtilMaintenanceApi* | [**getMaintenance**](docs/UtilMaintenanceApi.md#getMaintenance) | **GET** /maintenance | Get current maintenance info
*UtilMaintenanceApi* | [**setMaintenance**](docs/UtilMaintenanceApi.md#setMaintenance) | **POST** /maintenance | Set current maintenance info
*UtilMaintenanceApi* | [**updateMaintenance**](docs/UtilMaintenanceApi.md#updateMaintenance) | **PUT** /maintenance | Update current maintenance info
*UtilSecurityApi* | [**getUserLocationLog**](docs/UtilSecurityApi.md#getUserLocationLog) | **GET** /security/country-log | Returns the authentication log for a user
*UtilSecurityApi* | [**getUserTokenDetails**](docs/UtilSecurityApi.md#getUserTokenDetails) | **GET** /me | Returns the authentication token details. Use /users endpoint for detailed user&#39;s info
*UtilVersionApi* | [**getVersion**](docs/UtilVersionApi.md#getVersion) | **GET** /version | Get current version info


## Documentation for Models

 - [AchievementDefinitionResource](docs/AchievementDefinitionResource.md)
 - [ActionContextobject](docs/ActionContextobject.md)
 - [ActionResource](docs/ActionResource.md)
 - [ActionVariableResource](docs/ActionVariableResource.md)
 - [ActivityEntitlementResource](docs/ActivityEntitlementResource.md)
 - [ActivityOccurrenceCreationFailure](docs/ActivityOccurrenceCreationFailure.md)
 - [ActivityOccurrenceJoinResult](docs/ActivityOccurrenceJoinResult.md)
 - [ActivityOccurrenceResource](docs/ActivityOccurrenceResource.md)
 - [ActivityOccurrenceResults](docs/ActivityOccurrenceResults.md)
 - [ActivityOccurrenceResultsResource](docs/ActivityOccurrenceResultsResource.md)
 - [ActivityOccurrenceSettingsResource](docs/ActivityOccurrenceSettingsResource.md)
 - [ActivityOccurrenceStatusWrapper](docs/ActivityOccurrenceStatusWrapper.md)
 - [ActivityResource](docs/ActivityResource.md)
 - [ActivityUserResource](docs/ActivityUserResource.md)
 - [ActivityUserStatusWrapper](docs/ActivityUserStatusWrapper.md)
 - [AddressResource](docs/AddressResource.md)
 - [AggregateCountResource](docs/AggregateCountResource.md)
 - [AggregateInvoiceReportResource](docs/AggregateInvoiceReportResource.md)
 - [AmazonS3Activity](docs/AmazonS3Activity.md)
 - [AnswerResource](docs/AnswerResource.md)
 - [ApplyPaymentRequest](docs/ApplyPaymentRequest.md)
 - [ArgumentResource](docs/ArgumentResource.md)
 - [ArticleResource](docs/ArticleResource.md)
 - [ArtistResource](docs/ArtistResource.md)
 - [AvailableSettingResource](docs/AvailableSettingResource.md)
 - [BareActivityResource](docs/BareActivityResource.md)
 - [BareChallengeActivityResource](docs/BareChallengeActivityResource.md)
 - [BasicTemplatedResource](docs/BasicTemplatedResource.md)
 - [Batch](docs/Batch.md)
 - [BatchRequest](docs/BatchRequest.md)
 - [BatchResult](docs/BatchResult.md)
 - [BatchReturn](docs/BatchReturn.md)
 - [Behavior](docs/Behavior.md)
 - [BehaviorDefinitionResource](docs/BehaviorDefinitionResource.md)
 - [BillingReport](docs/BillingReport.md)
 - [BooleanResource](docs/BooleanResource.md)
 - [BreActionLog](docs/BreActionLog.md)
 - [BreEvent](docs/BreEvent.md)
 - [BreEventLog](docs/BreEventLog.md)
 - [BreGlobalResource](docs/BreGlobalResource.md)
 - [BreGlobalScopeDefinition](docs/BreGlobalScopeDefinition.md)
 - [BreRule](docs/BreRule.md)
 - [BreRuleLog](docs/BreRuleLog.md)
 - [BreTriggerParameterDefinition](docs/BreTriggerParameterDefinition.md)
 - [BreTriggerResource](docs/BreTriggerResource.md)
 - [BroadcastableEvent](docs/BroadcastableEvent.md)
 - [BundledSku](docs/BundledSku.md)
 - [CampaignResource](docs/CampaignResource.md)
 - [Cart](docs/Cart.md)
 - [CartItemRequest](docs/CartItemRequest.md)
 - [CartLineItem](docs/CartLineItem.md)
 - [CartShippableResponse](docs/CartShippableResponse.md)
 - [CartShippingAddressRequest](docs/CartShippingAddressRequest.md)
 - [CartShippingOption](docs/CartShippingOption.md)
 - [CartSummary](docs/CartSummary.md)
 - [CatalogSale](docs/CatalogSale.md)
 - [CategoryResource](docs/CategoryResource.md)
 - [ChallengeActivityResource](docs/ChallengeActivityResource.md)
 - [ChallengeEventParticipantResource](docs/ChallengeEventParticipantResource.md)
 - [ChallengeEventResource](docs/ChallengeEventResource.md)
 - [ChallengeResource](docs/ChallengeResource.md)
 - [ChatBlacklistResource](docs/ChatBlacklistResource.md)
 - [ChatMessageRequest](docs/ChatMessageRequest.md)
 - [ChatMessageResource](docs/ChatMessageResource.md)
 - [ChatThreadResource](docs/ChatThreadResource.md)
 - [ChatUserThreadResource](docs/ChatUserThreadResource.md)
 - [ClientResource](docs/ClientResource.md)
 - [CommentResource](docs/CommentResource.md)
 - [Config](docs/Config.md)
 - [ConfigLookupResource](docs/ConfigLookupResource.md)
 - [ConstantResource](docs/ConstantResource.md)
 - [ContributionResource](docs/ContributionResource.md)
 - [CoreActivityOccurrenceSettings](docs/CoreActivityOccurrenceSettings.md)
 - [CoreActivitySettings](docs/CoreActivitySettings.md)
 - [CoreChallengeActivitySettings](docs/CoreChallengeActivitySettings.md)
 - [Country](docs/Country.md)
 - [CountryResource](docs/CountryResource.md)
 - [CountryTaxResource](docs/CountryTaxResource.md)
 - [CouponDefinition](docs/CouponDefinition.md)
 - [CreateActivityOccurrenceRequest](docs/CreateActivityOccurrenceRequest.md)
 - [CreateBillingAgreementRequest](docs/CreateBillingAgreementRequest.md)
 - [CreatePayPalPaymentRequest](docs/CreatePayPalPaymentRequest.md)
 - [CurrencyResource](docs/CurrencyResource.md)
 - [CustomerConfig](docs/CustomerConfig.md)
 - [DatabaseConfig](docs/DatabaseConfig.md)
 - [DateOperationResource](docs/DateOperationResource.md)
 - [DefaultOperationResource](docs/DefaultOperationResource.md)
 - [DeltaResource](docs/DeltaResource.md)
 - [DeviceResource](docs/DeviceResource.md)
 - [Discount](docs/Discount.md)
 - [DispositionCount](docs/DispositionCount.md)
 - [DispositionResource](docs/DispositionResource.md)
 - [DoubleOperationResource](docs/DoubleOperationResource.md)
 - [EntitlementGrantRequest](docs/EntitlementGrantRequest.md)
 - [ErrorResource](docs/ErrorResource.md)
 - [EventContextResource](docs/EventContextResource.md)
 - [ExpressionResource](docs/ExpressionResource.md)
 - [Expressionobject](docs/Expressionobject.md)
 - [FacebookToken](docs/FacebookToken.md)
 - [FattMerchantPaymentMethod](docs/FattMerchantPaymentMethod.md)
 - [FattMerchantPaymentMethodRequest](docs/FattMerchantPaymentMethodRequest.md)
 - [FinalizeBillingAgreementRequest](docs/FinalizeBillingAgreementRequest.md)
 - [FinalizePayPalPaymentRequest](docs/FinalizePayPalPaymentRequest.md)
 - [FlagReportResource](docs/FlagReportResource.md)
 - [FlagResource](docs/FlagResource.md)
 - [ForwardLog](docs/ForwardLog.md)
 - [FulfillmentType](docs/FulfillmentType.md)
 - [GlobalCheckAndIncrementResource](docs/GlobalCheckAndIncrementResource.md)
 - [GlobalResource](docs/GlobalResource.md)
 - [GoogleToken](docs/GoogleToken.md)
 - [GrantTypeResource](docs/GrantTypeResource.md)
 - [GroupMemberResource](docs/GroupMemberResource.md)
 - [GroupMemberStatusWrapper](docs/GroupMemberStatusWrapper.md)
 - [GroupResource](docs/GroupResource.md)
 - [IdRef](docs/IdRef.md)
 - [ImportJobOutputResource](docs/ImportJobOutputResource.md)
 - [ImportJobResource](docs/ImportJobResource.md)
 - [IntWrapper](docs/IntWrapper.md)
 - [IntegerOperationResource](docs/IntegerOperationResource.md)
 - [InventoryStatusWrapper](docs/InventoryStatusWrapper.md)
 - [InventorySubscriptionResource](docs/InventorySubscriptionResource.md)
 - [InvoiceCreateRequest](docs/InvoiceCreateRequest.md)
 - [InvoiceItemResource](docs/InvoiceItemResource.md)
 - [InvoiceLogEntry](docs/InvoiceLogEntry.md)
 - [InvoicePaymentStatusRequest](docs/InvoicePaymentStatusRequest.md)
 - [InvoiceResource](docs/InvoiceResource.md)
 - [Item](docs/Item.md)
 - [ItemBehaviorDefinitionResource](docs/ItemBehaviorDefinitionResource.md)
 - [ItemIdRequest](docs/ItemIdRequest.md)
 - [ItemTemplateResource](docs/ItemTemplateResource.md)
 - [KeyValuePairstringstring](docs/KeyValuePairstringstring.md)
 - [LeaderboardEntryResource](docs/LeaderboardEntryResource.md)
 - [LeaderboardResource](docs/LeaderboardResource.md)
 - [LevelingResource](docs/LevelingResource.md)
 - [LimitedGettableGroup](docs/LimitedGettableGroup.md)
 - [LocationLogResource](docs/LocationLogResource.md)
 - [LookupResource](docs/LookupResource.md)
 - [Maintenance](docs/Maintenance.md)
 - [MapResource](docs/MapResource.md)
 - [MessageContentResource](docs/MessageContentResource.md)
 - [MessageResource](docs/MessageResource.md)
 - [MessageTemplateBulkRequest](docs/MessageTemplateBulkRequest.md)
 - [MessageTemplateResource](docs/MessageTemplateResource.md)
 - [MetricResource](docs/MetricResource.md)
 - [MongoDatabaseConfig](docs/MongoDatabaseConfig.md)
 - [NestedCategory](docs/NestedCategory.md)
 - [NewPasswordRequest](docs/NewPasswordRequest.md)
 - [NotificationResource](docs/NotificationResource.md)
 - [NotificationTypeResource](docs/NotificationTypeResource.md)
 - [NotificationUserTypeResource](docs/NotificationUserTypeResource.md)
 - [OAuth2Resource](docs/OAuth2Resource.md)
 - [OauthAccessTokenResource](docs/OauthAccessTokenResource.md)
 - [ObjectResource](docs/ObjectResource.md)
 - [OperationDefinitionResource](docs/OperationDefinitionResource.md)
 - [OperationResource](docs/OperationResource.md)
 - [Operator](docs/Operator.md)
 - [OptimalPaymentRequest](docs/OptimalPaymentRequest.md)
 - [Order](docs/Order.md)
 - [PageResourceAchievementDefinitionResource](docs/PageResourceAchievementDefinitionResource.md)
 - [PageResourceActivityOccurrenceResource](docs/PageResourceActivityOccurrenceResource.md)
 - [PageResourceAggregateCountResource](docs/PageResourceAggregateCountResource.md)
 - [PageResourceAggregateInvoiceReportResource](docs/PageResourceAggregateInvoiceReportResource.md)
 - [PageResourceArticleResource](docs/PageResourceArticleResource.md)
 - [PageResourceArtistResource](docs/PageResourceArtistResource.md)
 - [PageResourceBareActivityResource](docs/PageResourceBareActivityResource.md)
 - [PageResourceBareChallengeActivityResource](docs/PageResourceBareChallengeActivityResource.md)
 - [PageResourceBillingReport](docs/PageResourceBillingReport.md)
 - [PageResourceBreEventLog](docs/PageResourceBreEventLog.md)
 - [PageResourceBreGlobalResource](docs/PageResourceBreGlobalResource.md)
 - [PageResourceBreRule](docs/PageResourceBreRule.md)
 - [PageResourceBreTriggerResource](docs/PageResourceBreTriggerResource.md)
 - [PageResourceCampaignResource](docs/PageResourceCampaignResource.md)
 - [PageResourceCartSummary](docs/PageResourceCartSummary.md)
 - [PageResourceCatalogSale](docs/PageResourceCatalogSale.md)
 - [PageResourceCategoryResource](docs/PageResourceCategoryResource.md)
 - [PageResourceChallengeEventParticipantResource](docs/PageResourceChallengeEventParticipantResource.md)
 - [PageResourceChallengeEventResource](docs/PageResourceChallengeEventResource.md)
 - [PageResourceChallengeResource](docs/PageResourceChallengeResource.md)
 - [PageResourceChatMessageResource](docs/PageResourceChatMessageResource.md)
 - [PageResourceChatUserThreadResource](docs/PageResourceChatUserThreadResource.md)
 - [PageResourceClientResource](docs/PageResourceClientResource.md)
 - [PageResourceCommentResource](docs/PageResourceCommentResource.md)
 - [PageResourceConfig](docs/PageResourceConfig.md)
 - [PageResourceCountryTaxResource](docs/PageResourceCountryTaxResource.md)
 - [PageResourceCurrencyResource](docs/PageResourceCurrencyResource.md)
 - [PageResourceDeviceResource](docs/PageResourceDeviceResource.md)
 - [PageResourceDispositionResource](docs/PageResourceDispositionResource.md)
 - [PageResourceEntitlementItem](docs/PageResourceEntitlementItem.md)
 - [PageResourceFlagReportResource](docs/PageResourceFlagReportResource.md)
 - [PageResourceFlagResource](docs/PageResourceFlagResource.md)
 - [PageResourceForwardLog](docs/PageResourceForwardLog.md)
 - [PageResourceFulfillmentType](docs/PageResourceFulfillmentType.md)
 - [PageResourceGroupMemberResource](docs/PageResourceGroupMemberResource.md)
 - [PageResourceGroupResource](docs/PageResourceGroupResource.md)
 - [PageResourceImportJobResource](docs/PageResourceImportJobResource.md)
 - [PageResourceInvoiceLogEntry](docs/PageResourceInvoiceLogEntry.md)
 - [PageResourceInvoiceResource](docs/PageResourceInvoiceResource.md)
 - [PageResourceItemTemplateResource](docs/PageResourceItemTemplateResource.md)
 - [PageResourceLevelingResource](docs/PageResourceLevelingResource.md)
 - [PageResourceLocationLogResource](docs/PageResourceLocationLogResource.md)
 - [PageResourceMessageTemplateResource](docs/PageResourceMessageTemplateResource.md)
 - [PageResourceNotificationTypeResource](docs/PageResourceNotificationTypeResource.md)
 - [PageResourceNotificationUserTypeResource](docs/PageResourceNotificationUserTypeResource.md)
 - [PageResourceOauthAccessTokenResource](docs/PageResourceOauthAccessTokenResource.md)
 - [PageResourceObjectResource](docs/PageResourceObjectResource.md)
 - [PageResourcePaymentMethodTypeResource](docs/PageResourcePaymentMethodTypeResource.md)
 - [PageResourcePermissionResource](docs/PageResourcePermissionResource.md)
 - [PageResourcePollResource](docs/PageResourcePollResource.md)
 - [PageResourceQuestionResource](docs/PageResourceQuestionResource.md)
 - [PageResourceQuestionTemplateResource](docs/PageResourceQuestionTemplateResource.md)
 - [PageResourceRevenueCountryReportResource](docs/PageResourceRevenueCountryReportResource.md)
 - [PageResourceRevenueProductReportResource](docs/PageResourceRevenueProductReportResource.md)
 - [PageResourceRewardSetResource](docs/PageResourceRewardSetResource.md)
 - [PageResourceRoleResource](docs/PageResourceRoleResource.md)
 - [PageResourceSavedAddressResource](docs/PageResourceSavedAddressResource.md)
 - [PageResourceSimpleReferenceResourceobject](docs/PageResourceSimpleReferenceResourceobject.md)
 - [PageResourceSimpleUserResource](docs/PageResourceSimpleUserResource.md)
 - [PageResourceSimpleWallet](docs/PageResourceSimpleWallet.md)
 - [PageResourceStateTaxResource](docs/PageResourceStateTaxResource.md)
 - [PageResourceStoreItem](docs/PageResourceStoreItem.md)
 - [PageResourceStoreItemTemplateResource](docs/PageResourceStoreItemTemplateResource.md)
 - [PageResourceSubscriptionResource](docs/PageResourceSubscriptionResource.md)
 - [PageResourceSubscriptionTemplateResource](docs/PageResourceSubscriptionTemplateResource.md)
 - [PageResourceTemplateResource](docs/PageResourceTemplateResource.md)
 - [PageResourceTopicResource](docs/PageResourceTopicResource.md)
 - [PageResourceTransactionResource](docs/PageResourceTransactionResource.md)
 - [PageResourceUsageInfo](docs/PageResourceUsageInfo.md)
 - [PageResourceUserAchievementGroupResource](docs/PageResourceUserAchievementGroupResource.md)
 - [PageResourceUserActionLog](docs/PageResourceUserActionLog.md)
 - [PageResourceUserBaseResource](docs/PageResourceUserBaseResource.md)
 - [PageResourceUserInventoryResource](docs/PageResourceUserInventoryResource.md)
 - [PageResourceUserItemLogResource](docs/PageResourceUserItemLogResource.md)
 - [PageResourceUserLevelingResource](docs/PageResourceUserLevelingResource.md)
 - [PageResourceUserNotificationResource](docs/PageResourceUserNotificationResource.md)
 - [PageResourceUserRelationshipResource](docs/PageResourceUserRelationshipResource.md)
 - [PageResourceVendorResource](docs/PageResourceVendorResource.md)
 - [PageResourceVideoRelationshipResource](docs/PageResourceVideoRelationshipResource.md)
 - [PageResourceVideoResource](docs/PageResourceVideoResource.md)
 - [PageResourceWalletTotalResponse](docs/PageResourceWalletTotalResponse.md)
 - [PageResourceWalletTransactionResource](docs/PageResourceWalletTransactionResource.md)
 - [PageResourcestring](docs/PageResourcestring.md)
 - [ParameterResource](docs/ParameterResource.md)
 - [Participant](docs/Participant.md)
 - [PasswordResetRequest](docs/PasswordResetRequest.md)
 - [PayBySavedMethodRequest](docs/PayBySavedMethodRequest.md)
 - [PaymentAuthorizationResource](docs/PaymentAuthorizationResource.md)
 - [PaymentMethodDetails](docs/PaymentMethodDetails.md)
 - [PaymentMethodResource](docs/PaymentMethodResource.md)
 - [PaymentMethodTypeResource](docs/PaymentMethodTypeResource.md)
 - [PermissionResource](docs/PermissionResource.md)
 - [PollAnswerResource](docs/PollAnswerResource.md)
 - [PollResource](docs/PollResource.md)
 - [PollResponseResource](docs/PollResponseResource.md)
 - [PredicateResource](docs/PredicateResource.md)
 - [Property](docs/Property.md)
 - [PropertyDefinitionResource](docs/PropertyDefinitionResource.md)
 - [PropertyFieldListResource](docs/PropertyFieldListResource.md)
 - [PropertyFieldResource](docs/PropertyFieldResource.md)
 - [QuestionResource](docs/QuestionResource.md)
 - [QuestionTemplateResource](docs/QuestionTemplateResource.md)
 - [QuickBuyRequest](docs/QuickBuyRequest.md)
 - [RawEmailResource](docs/RawEmailResource.md)
 - [RawPushResource](docs/RawPushResource.md)
 - [RawSMSResource](docs/RawSMSResource.md)
 - [ReactivateSubscriptionRequest](docs/ReactivateSubscriptionRequest.md)
 - [RefundRequest](docs/RefundRequest.md)
 - [RefundResource](docs/RefundResource.md)
 - [ResourceTypeDescription](docs/ResourceTypeDescription.md)
 - [Result](docs/Result.md)
 - [RevenueCountryReportResource](docs/RevenueCountryReportResource.md)
 - [RevenueProductReportResource](docs/RevenueProductReportResource.md)
 - [RevenueReportResource](docs/RevenueReportResource.md)
 - [RewardCurrencyResource](docs/RewardCurrencyResource.md)
 - [RewardItemResource](docs/RewardItemResource.md)
 - [RewardSetResource](docs/RewardSetResource.md)
 - [RoleResource](docs/RoleResource.md)
 - [S3Config](docs/S3Config.md)
 - [SampleCountriesResponse](docs/SampleCountriesResponse.md)
 - [SavedAddressResource](docs/SavedAddressResource.md)
 - [Schedule](docs/Schedule.md)
 - [SelectedSettingRequest](docs/SelectedSettingRequest.md)
 - [SelectedSettingResource](docs/SelectedSettingResource.md)
 - [SettingOption](docs/SettingOption.md)
 - [SimpleGroupResource](docs/SimpleGroupResource.md)
 - [SimpleReferenceResourceint](docs/SimpleReferenceResourceint.md)
 - [SimpleReferenceResourcelong](docs/SimpleReferenceResourcelong.md)
 - [SimpleReferenceResourceobject](docs/SimpleReferenceResourceobject.md)
 - [SimpleReferenceResourcestring](docs/SimpleReferenceResourcestring.md)
 - [SimpleUserResource](docs/SimpleUserResource.md)
 - [SimpleWallet](docs/SimpleWallet.md)
 - [Sku](docs/Sku.md)
 - [SkuRequest](docs/SkuRequest.md)
 - [SqlDatabaseConfig](docs/SqlDatabaseConfig.md)
 - [StateResource](docs/StateResource.md)
 - [StateTaxResource](docs/StateTaxResource.md)
 - [StoreItemTemplateResource](docs/StoreItemTemplateResource.md)
 - [StringOperationResource](docs/StringOperationResource.md)
 - [StringWrapper](docs/StringWrapper.md)
 - [StripeCreatePaymentMethod](docs/StripeCreatePaymentMethod.md)
 - [StripePaymentRequest](docs/StripePaymentRequest.md)
 - [SubscriptionCreditResource](docs/SubscriptionCreditResource.md)
 - [SubscriptionPlan](docs/SubscriptionPlan.md)
 - [SubscriptionPlanResource](docs/SubscriptionPlanResource.md)
 - [SubscriptionPriceOverrideRequest](docs/SubscriptionPriceOverrideRequest.md)
 - [SubscriptionResource](docs/SubscriptionResource.md)
 - [SubscriptionStatusWrapper](docs/SubscriptionStatusWrapper.md)
 - [SubscriptionTemplateResource](docs/SubscriptionTemplateResource.md)
 - [TemplateEmailResource](docs/TemplateEmailResource.md)
 - [TemplatePushResource](docs/TemplatePushResource.md)
 - [TemplateResource](docs/TemplateResource.md)
 - [TemplateSMSResource](docs/TemplateSMSResource.md)
 - [TemplatedEmail](docs/TemplatedEmail.md)
 - [TierResource](docs/TierResource.md)
 - [TokenDetailsResource](docs/TokenDetailsResource.md)
 - [Topic](docs/Topic.md)
 - [TopicResource](docs/TopicResource.md)
 - [TopicSubscriber](docs/TopicSubscriber.md)
 - [TopicSubscriberResource](docs/TopicSubscriberResource.md)
 - [TransactionResource](docs/TransactionResource.md)
 - [TypeHintLookupResource](docs/TypeHintLookupResource.md)
 - [UsageInfo](docs/UsageInfo.md)
 - [UserAchievementGroupResource](docs/UserAchievementGroupResource.md)
 - [UserAchievementResource](docs/UserAchievementResource.md)
 - [UserActionLog](docs/UserActionLog.md)
 - [UserActivityResults](docs/UserActivityResults.md)
 - [UserActivityResultsResource](docs/UserActivityResultsResource.md)
 - [UserBaseResource](docs/UserBaseResource.md)
 - [UserInventoryAddRequest](docs/UserInventoryAddRequest.md)
 - [UserInventoryResource](docs/UserInventoryResource.md)
 - [UserItemLogResource](docs/UserItemLogResource.md)
 - [UserLevelingResource](docs/UserLevelingResource.md)
 - [UserNotificationResource](docs/UserNotificationResource.md)
 - [UserNotificationStatusWrapper](docs/UserNotificationStatusWrapper.md)
 - [UserRelationshipReferenceResource](docs/UserRelationshipReferenceResource.md)
 - [UserRelationshipResource](docs/UserRelationshipResource.md)
 - [UserResource](docs/UserResource.md)
 - [UsernameLookupResource](docs/UsernameLookupResource.md)
 - [ValueWrapperboolean](docs/ValueWrapperboolean.md)
 - [VariableTypeResource](docs/VariableTypeResource.md)
 - [VendorEmailLookupResource](docs/VendorEmailLookupResource.md)
 - [VendorResource](docs/VendorResource.md)
 - [Version](docs/Version.md)
 - [VideoRelationshipResource](docs/VideoRelationshipResource.md)
 - [VideoResource](docs/VideoResource.md)
 - [WalletAlterRequest](docs/WalletAlterRequest.md)
 - [WalletTotalResponse](docs/WalletTotalResponse.md)
 - [WalletTransactionResource](docs/WalletTransactionResource.md)
 - [WebsocketMessageResource](docs/WebsocketMessageResource.md)
 - [XsollaPaymentRequest](docs/XsollaPaymentRequest.md)
 - [AudioPropertyDefinitionResource](docs/AudioPropertyDefinitionResource.md)
 - [BooleanProperty](docs/BooleanProperty.md)
 - [BooleanPropertyDefinitionResource](docs/BooleanPropertyDefinitionResource.md)
 - [CacheClearEvent](docs/CacheClearEvent.md)
 - [Consumable](docs/Consumable.md)
 - [DateProperty](docs/DateProperty.md)
 - [DatePropertyDefinitionResource](docs/DatePropertyDefinitionResource.md)
 - [DoubleProperty](docs/DoubleProperty.md)
 - [DoublePropertyDefinitionResource](docs/DoublePropertyDefinitionResource.md)
 - [EntitlementItem](docs/EntitlementItem.md)
 - [Expirable](docs/Expirable.md)
 - [FileGroupProperty](docs/FileGroupProperty.md)
 - [FileGroupPropertyDefinitionResource](docs/FileGroupPropertyDefinitionResource.md)
 - [FileProperty](docs/FileProperty.md)
 - [FilePropertyDefinitionResource](docs/FilePropertyDefinitionResource.md)
 - [FormattedTextProperty](docs/FormattedTextProperty.md)
 - [FormattedTextPropertyDefinitionResource](docs/FormattedTextPropertyDefinitionResource.md)
 - [Fulfillable](docs/Fulfillable.md)
 - [GuestPlayable](docs/GuestPlayable.md)
 - [ImagePropertyDefinitionResource](docs/ImagePropertyDefinitionResource.md)
 - [IntegerProperty](docs/IntegerProperty.md)
 - [IntegerPropertyDefinitionResource](docs/IntegerPropertyDefinitionResource.md)
 - [LimitedGettable](docs/LimitedGettable.md)
 - [ListProperty](docs/ListProperty.md)
 - [ListPropertyDefinitionResource](docs/ListPropertyDefinitionResource.md)
 - [LogLevelEvent](docs/LogLevelEvent.md)
 - [LongProperty](docs/LongProperty.md)
 - [LongPropertyDefinitionResource](docs/LongPropertyDefinitionResource.md)
 - [MapProperty](docs/MapProperty.md)
 - [MapPropertyDefinitionResource](docs/MapPropertyDefinitionResource.md)
 - [MobileDeviceResource](docs/MobileDeviceResource.md)
 - [NewCustomerEvent](docs/NewCustomerEvent.md)
 - [PreReqEntitlement](docs/PreReqEntitlement.md)
 - [PriceOverridable](docs/PriceOverridable.md)
 - [RemoveCustomerEvent](docs/RemoveCustomerEvent.md)
 - [ServiceDeployedEvent](docs/ServiceDeployedEvent.md)
 - [Spendable](docs/Spendable.md)
 - [StoreItem](docs/StoreItem.md)
 - [TextProperty](docs/TextProperty.md)
 - [TextPropertyDefinitionResource](docs/TextPropertyDefinitionResource.md)
 - [TimePeriodGettable](docs/TimePeriodGettable.md)
 - [TimePeriodUsable](docs/TimePeriodUsable.md)
 - [VideoPropertyDefinitionResource](docs/VideoPropertyDefinitionResource.md)
 - [WebsocketRemoveTopicEvent](docs/WebsocketRemoveTopicEvent.md)
 - [WebsocketSendMessageEvent](docs/WebsocketSendMessageEvent.md)
 - [WebsocketSendTopicMessageEvent](docs/WebsocketSendTopicMessageEvent.md)
 - [WebsocketSubscribeEvent](docs/WebsocketSubscribeEvent.md)
 - [WebsocketUnsubscribeEvent](docs/WebsocketUnsubscribeEvent.md)
 - [AudioGroupProperty](docs/AudioGroupProperty.md)
 - [AudioGroupPropertyDefinitionResource](docs/AudioGroupPropertyDefinitionResource.md)
 - [AudioProperty](docs/AudioProperty.md)
 - [BundleItem](docs/BundleItem.md)
 - [CouponItem](docs/CouponItem.md)
 - [ImageGroupProperty](docs/ImageGroupProperty.md)
 - [ImageGroupPropertyDefinitionResource](docs/ImageGroupPropertyDefinitionResource.md)
 - [ImageProperty](docs/ImageProperty.md)
 - [ShippingItem](docs/ShippingItem.md)
 - [Subscription](docs/Subscription.md)
 - [VideoGroupProperty](docs/VideoGroupProperty.md)
 - [VideoGroupPropertyDefinitionResource](docs/VideoGroupPropertyDefinitionResource.md)
 - [VideoProperty](docs/VideoProperty.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### oauth2_client_credentials_grant

- **Type**: OAuth
- **Flow**: application
- **Authorization URL**: 
- **Scopes**: 
  - read write: read write

### oauth2_password_grant

- **Type**: OAuth
- **Flow**: password
- **Authorization URL**: 
- **Scopes**: 
  - read write: read write


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support@knetik.com

