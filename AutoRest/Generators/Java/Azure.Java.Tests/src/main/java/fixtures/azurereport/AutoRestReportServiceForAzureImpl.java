/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azurereport;

import com.google.common.reflect.TypeToken;
import com.microsoft.rest.AzureClient;
import com.microsoft.rest.AzureServiceClient;
import com.microsoft.rest.AzureServiceResponseBuilder;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.CustomHeaderInterceptor;
import com.microsoft.rest.serializer.AzureJacksonUtils;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseCallback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.ResponseBody;
import fixtures.azurereport.models.Error;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;
import retrofit.Call;
import retrofit.Response;
import retrofit.Retrofit;

/**
 * Initializes a new instance of the AutoRestReportServiceForAzure class.
 */
public final class AutoRestReportServiceForAzureImpl extends AzureServiceClient implements AutoRestReportServiceForAzure {
    /** The Retrofit service to perform REST calls. */
    private AutoRestReportServiceForAzureService service;
    /** The URI used as the base for all cloud service requests. */
    private final String baseUri;
    /** the {@link AzureClient} used for long running operations. */
    private AzureClient azureClient;

    /**
     * Gets the URI used as the base for all cloud service requests.
     * @return The BaseUri value.
     */
    public String getBaseUri() {
        return this.baseUri;
    }

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    public AzureClient getAzureClient() {
        return this.azureClient;
    }

    /** The management credentials for Azure. */
    private ServiceClientCredentials credentials;

    /**
     * Gets The management credentials for Azure.
     *
     * @return the credentials value.
     */
    public ServiceClientCredentials getCredentials() {
        return this.credentials;
    }

    /** Gets or sets the preferred language for the response. */
    private String acceptLanguage;

    /**
     * Gets Gets or sets the preferred language for the response.
     *
     * @return the acceptLanguage value.
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * Sets Gets or sets the preferred language for the response.
     *
     * @param acceptLanguage the acceptLanguage value.
     */
    public void setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }

    /** The retry timeout for Long Running Operations. */
    private int longRunningOperationRetryTimeout;

    /**
     * Gets The retry timeout for Long Running Operations.
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    public int getLongRunningOperationRetryTimeout() {
        return this.longRunningOperationRetryTimeout;
    }

    /**
     * Sets The retry timeout for Long Running Operations.
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     */
    public void setLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
        this.longRunningOperationRetryTimeout = longRunningOperationRetryTimeout;
    }

    /**
     * Initializes an instance of AutoRestReportServiceForAzure client.
     */
    public AutoRestReportServiceForAzureImpl() {
        this("http://localhost");
    }

    /**
     * Initializes an instance of AutoRestReportServiceForAzure client.
     *
     * @param baseUri the base URI of the host
     */
    public AutoRestReportServiceForAzureImpl(String baseUri) {
        this(baseUri, null);
    }

    /**
     * Initializes an instance of AutoRestReportServiceForAzure client.
     *
     * @param credentials the management credentials for Azure
     */
    public AutoRestReportServiceForAzureImpl(ServiceClientCredentials credentials) {
        this("http://localhost", credentials);
    }

    /**
     * Initializes an instance of AutoRestReportServiceForAzure client.
     *
     * @param baseUri the base URI of the host
     * @param credentials the management credentials for Azure
     */
    public AutoRestReportServiceForAzureImpl(String baseUri, ServiceClientCredentials credentials) {
        super();
        this.baseUri = baseUri;
        this.credentials = credentials;
        initialize();
    }

    /**
     * Initializes an instance of AutoRestReportServiceForAzure client.
     *
     * @param baseUri the base URI of the host
     * @param credentials the management credentials for Azure
     * @param client the {@link OkHttpClient} client to use for REST calls
     * @param retrofitBuilder the builder for building up a {@link Retrofit}
     */
    public AutoRestReportServiceForAzureImpl(String baseUri, ServiceClientCredentials credentials, OkHttpClient client, Retrofit.Builder retrofitBuilder) {
        super(client, retrofitBuilder);
        this.baseUri = baseUri;
        this.credentials = credentials;
        initialize();
    }

    private void initialize() {
        if (this.credentials != null) {
            this.credentials.applyCredentialsFilter(this.client);
        }
        this.acceptLanguage = "en-US";
        this.getClientInterceptors().add(new CustomHeaderInterceptor("x-ms-client-request-id", UUID.randomUUID().toString()));
        this.azureClient = new AzureClient(client, retrofitBuilder);
        this.azureClient.setCredentials(this.credentials);
        this.retrofitBuilder.baseUrl(baseUri);
        service = this.retrofitBuilder.build().create(AutoRestReportServiceForAzureService.class);
    }

    /**
     * Get test coverage report.
     *
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Map&lt;String, Integer&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Map<String, Integer>> getReport() throws ServiceException, IOException {
        Call<ResponseBody> call = service.getReport(this.getAcceptLanguage());
        return getReportDelegate(call.execute(), null);
    }

    /**
     * Get test coverage report.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> getReportAsync(final ServiceCallback<Map<String, Integer>> serviceCallback) {
        Call<ResponseBody> call = service.getReport(this.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<Map<String, Integer>>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getReportDelegate(response, retrofit));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Map<String, Integer>> getReportDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException, IOException {
        return new AzureServiceResponseBuilder<Map<String, Integer>>(new AzureJacksonUtils())
                .register(200, new TypeToken<Map<String, Integer>>() { }.getType())
                .registerError(new TypeToken<Error>() { }.getType())
                .build(response, retrofit);
    }

}
