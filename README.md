# edison-credentials-client

Edison Credentials API
- API version: 0.0.1
  - Build date: 2020-12-10T15:22:45.234670+01:00[Europe/Zurich]

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.sicpa.edison</groupId>
  <artifactId>edison-credentials-client</artifactId>
  <version>0.0.1</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.sicpa.edison:edison-credentials-client:0.0.1"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/edison-credentials-client-0.0.1.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import com.sicpa.edison.credentialsclient.client.ApiClient;
import com.sicpa.edison.credentialsclient.client.ApiException;
import com.sicpa.edison.credentialsclient.client.Configuration;
import com.sicpa.edison.credentialsclient.client.models.*;
import com.sicpa.edison.credentialsclient.api.ClientsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ClientsApi apiInstance = new ClientsApi(defaultClient);
    Integer clientId = 0; // Integer | An client ID.
    try {
      Client result = apiInstance.clientClientIdGet(clientId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClientsApi#clientClientIdGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ClientsApi* | [**clientClientIdGet**](docs/ClientsApi.md#clientClientIdGet) | **GET** /clients/{clientId} | Get client
*ClientsApi* | [**clientPost**](docs/ClientsApi.md#clientPost) | **POST** /clients | Create a new client
*ClientsApi* | [**clientsGet**](docs/ClientsApi.md#clientsGet) | **GET** /clients | List all clients
*ConnectionsApi* | [**connectionOrganizationIdConnectionIdDelete**](docs/ConnectionsApi.md#connectionOrganizationIdConnectionIdDelete) | **DELETE** /connections/{connectionId} | Delete connection
*ConnectionsApi* | [**connectionOrganizationIdConnectionIdGet**](docs/ConnectionsApi.md#connectionOrganizationIdConnectionIdGet) | **GET** /connections/{connectionId} | Get connection
*ConnectionsApi* | [**connectionsInvitationPost**](docs/ConnectionsApi.md#connectionsInvitationPost) | **POST** /connections/invitation | Create a new connection invitation
*ConnectionsApi* | [**connectionsOrganizationIdGet**](docs/ConnectionsApi.md#connectionsOrganizationIdGet) | **GET** /connections | List all connections
*ConnectionsApi* | [**connectionsReceptionPost**](docs/ConnectionsApi.md#connectionsReceptionPost) | **POST** /connections/reception | Receive a new connection invitation
*CredentialDefinitionsApi* | [**clientClientIdGet1**](docs/CredentialDefinitionsApi.md#clientClientIdGet1) | **GET** /credential-definitions/{credentialDefinitionId} | Get credentialDefinition
*CredentialDefinitionsApi* | [**credentialDefinitionPost**](docs/CredentialDefinitionsApi.md#credentialDefinitionPost) | **POST** /credential-definitions | Create a new credentialDefinition
*CredentialDefinitionsApi* | [**credentialDefinitionsCreatedGet**](docs/CredentialDefinitionsApi.md#credentialDefinitionsCreatedGet) | **GET** /credential-definitions/created | Get created credential definitions
*CredentialsApi* | [**credentialCredentialIdDelete**](docs/CredentialsApi.md#credentialCredentialIdDelete) | **DELETE** /credentials/{credentialId} | Delete the specified credential
*CredentialsApi* | [**credentialCredentialIdGet**](docs/CredentialsApi.md#credentialCredentialIdGet) | **GET** /credentials/{credentialId} | Get the specified credential
*CredentialsApi* | [**credentialPost**](docs/CredentialsApi.md#credentialPost) | **POST** /credentials | Issue new credentials
*CredentialsApi* | [**credentialsGet**](docs/CredentialsApi.md#credentialsGet) | **GET** /credentials | List all credentials
*InternalWebhooksApi* | [**webhooksGet1**](docs/InternalWebhooksApi.md#webhooksGet1) | **GET** /internal/webhooks | List an organization&#39;s active webhooks with given type 
*MessagesApi* | [**messagePost**](docs/MessagesApi.md#messagePost) | **POST** /messages | Sends a message
*OrganizationsApi* | [**organizationOrganizationIdDelete**](docs/OrganizationsApi.md#organizationOrganizationIdDelete) | **DELETE** /organizations/{organizationId} | Delete organization
*OrganizationsApi* | [**organizationOrganizationIdGet**](docs/OrganizationsApi.md#organizationOrganizationIdGet) | **GET** /organizations/{organizationId} | Get organization
*OrganizationsApi* | [**organizationOrganizationIdImageDelete**](docs/OrganizationsApi.md#organizationOrganizationIdImageDelete) | **DELETE** /organizations/{organizationId}/image | Delete organization image
*OrganizationsApi* | [**organizationOrganizationIdImageGet**](docs/OrganizationsApi.md#organizationOrganizationIdImageGet) | **GET** /organizations/{organizationId}/image | Get organization image
*OrganizationsApi* | [**organizationOrganizationIdImagePut**](docs/OrganizationsApi.md#organizationOrganizationIdImagePut) | **PUT** /organizations/{organizationId}/image | Update organization image
*OrganizationsApi* | [**organizationOrganizationIdPut**](docs/OrganizationsApi.md#organizationOrganizationIdPut) | **PUT** /organizations/{organizationId} | Update organization
*OrganizationsApi* | [**organizationsGet**](docs/OrganizationsApi.md#organizationsGet) | **GET** /organizations | List all organizations
*OrganizationsApi* | [**organizationsPost**](docs/OrganizationsApi.md#organizationsPost) | **POST** /organizations | Create a new organization and setup a new wallet
*SchemasApi* | [**schemaPost**](docs/SchemasApi.md#schemaPost) | **POST** /schemas | Create a new schema
*SchemasApi* | [**schemaSchemaIdGet**](docs/SchemasApi.md#schemaSchemaIdGet) | **GET** /schemas/{schemaId} | Get schema
*SchemasApi* | [**schemasCreatedGet**](docs/SchemasApi.md#schemasCreatedGet) | **GET** /schemas/created | Get created schemas
*VerificationsApi* | [**verificationDelete**](docs/VerificationsApi.md#verificationDelete) | **DELETE** /verifications/{verificationId} | Delete verification
*VerificationsApi* | [**verificationGet**](docs/VerificationsApi.md#verificationGet) | **GET** /verifications/{verificationId} | Get verification
*VerificationsApi* | [**verificationTemplateDelete**](docs/VerificationsApi.md#verificationTemplateDelete) | **DELETE** /verificationTemplates/{verificationTemplateId} | Delete verification request
*VerificationsApi* | [**verificationTemplateGet**](docs/VerificationsApi.md#verificationTemplateGet) | **GET** /verificationTemplates/{verificationTemplateId} | Get verification template
*VerificationsApi* | [**verificationTemplatePut**](docs/VerificationsApi.md#verificationTemplatePut) | **PUT** /verificationTemplates/{verificationTemplateId} | Update verification template
*VerificationsApi* | [**verificationTemplatesGet**](docs/VerificationsApi.md#verificationTemplatesGet) | **GET** /verificationTemplates | List all verification templates
*VerificationsApi* | [**verificationTemplatesPost**](docs/VerificationsApi.md#verificationTemplatesPost) | **POST** /verificationTemplates | Create a new Verification Template
*VerificationsApi* | [**verificationsGet**](docs/VerificationsApi.md#verificationsGet) | **GET** /verifications | List all verifications
*VerificationsApi* | [**verificationsPost**](docs/VerificationsApi.md#verificationsPost) | **POST** /verifications | Create a new Verification
*WebhooksApi* | [**webhookPost**](docs/WebhooksApi.md#webhookPost) | **POST** /webhooks | Create a new webhook
*WebhooksApi* | [**webhookTypesGet**](docs/WebhooksApi.md#webhookTypesGet) | **GET** /webhooks/types | List all webhook types and their respective filters
*WebhooksApi* | [**webhookWebhookIdDelete**](docs/WebhooksApi.md#webhookWebhookIdDelete) | **DELETE** /webhooks/{webhookId} | Delete webhook
*WebhooksApi* | [**webhookWebhookIdGet**](docs/WebhooksApi.md#webhookWebhookIdGet) | **GET** /webhooks/{webhookId} | Get webhook
*WebhooksApi* | [**webhookWebhookIdPut**](docs/WebhooksApi.md#webhookWebhookIdPut) | **PUT** /webhooks/{webhookId} | Update a webhook
*WebhooksApi* | [**webhooksGet**](docs/WebhooksApi.md#webhooksGet) | **GET** /webhooks | List all webhooks


## Documentation for Models

 - [ApiError](docs/ApiError.md)
 - [Client](docs/Client.md)
 - [ClientCreate](docs/ClientCreate.md)
 - [Connection](docs/Connection.md)
 - [ConnectionInvitation](docs/ConnectionInvitation.md)
 - [ConnectionInvitationCreate](docs/ConnectionInvitationCreate.md)
 - [ConnectionInvitationCreationResult](docs/ConnectionInvitationCreationResult.md)
 - [ConnectionInvitationReception](docs/ConnectionInvitationReception.md)
 - [Credential](docs/Credential.md)
 - [CredentialAttribute](docs/CredentialAttribute.md)
 - [CredentialCreate](docs/CredentialCreate.md)
 - [CredentialDefinition](docs/CredentialDefinition.md)
 - [CredentialDefinitionCreate](docs/CredentialDefinitionCreate.md)
 - [CredentialDefinitionSummary](docs/CredentialDefinitionSummary.md)
 - [CredentialExchange](docs/CredentialExchange.md)
 - [CredentialProposal](docs/CredentialProposal.md)
 - [Did](docs/Did.md)
 - [IndyProofReqAttrSpec](docs/IndyProofReqAttrSpec.md)
 - [IndyProofReqNonRevoked](docs/IndyProofReqNonRevoked.md)
 - [IndyProofReqPredSpec](docs/IndyProofReqPredSpec.md)
 - [IndyProofReqPredSpecRestrictions](docs/IndyProofReqPredSpecRestrictions.md)
 - [InlineObject](docs/InlineObject.md)
 - [Message](docs/Message.md)
 - [Organization](docs/Organization.md)
 - [OrganizationCreate](docs/OrganizationCreate.md)
 - [OrganizationSummary](docs/OrganizationSummary.md)
 - [OrganizationUpdate](docs/OrganizationUpdate.md)
 - [Schema](docs/Schema.md)
 - [SchemaCreate](docs/SchemaCreate.md)
 - [SchemaSummary](docs/SchemaSummary.md)
 - [Verification](docs/Verification.md)
 - [VerificationParam](docs/VerificationParam.md)
 - [VerificationSummary](docs/VerificationSummary.md)
 - [VerificationTemplate](docs/VerificationTemplate.md)
 - [VerificationTemplateContent](docs/VerificationTemplateContent.md)
 - [VerificationTemplateParam](docs/VerificationTemplateParam.md)
 - [VerificationTemplateSummary](docs/VerificationTemplateSummary.md)
 - [Webhook](docs/Webhook.md)
 - [WebhookCreate](docs/WebhookCreate.md)
 - [WebhookType](docs/WebhookType.md)
 - [WebhookTypeFilter](docs/WebhookTypeFilter.md)
 - [WebhookUpdate](docs/WebhookUpdate.md)
 - [WebhookWebhookTypeUpsert](docs/WebhookWebhookTypeUpsert.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### auth

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



