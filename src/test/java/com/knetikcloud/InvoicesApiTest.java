/*
 * Knetik Platform API Documentation latest 
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://knetikcloud.com
 *
 * OpenAPI spec version: latest 
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.knetikcloud;

import com.ApiException;
import io.swagger.client.model.AddressResource;
import io.swagger.client.model.InvoiceCreateRequest;
import io.swagger.client.model.InvoicePaymentStatusRequest;
import io.swagger.client.model.InvoiceResource;
import io.swagger.client.model.PageResourceInvoiceLogEntry;
import io.swagger.client.model.PageResourceInvoiceResource;
import io.swagger.client.model.PayBySavedMethodRequest;
import io.swagger.client.model.Result;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InvoicesApi
 */
@Ignore
public class InvoicesApiTest {

    private final InvoicesApi api = new InvoicesApi();

    
    /**
     * Create an invoice
     *
     * Create an invoice(s) by providing a cart GUID. Note that there may be multiple invoices created, one per vendor.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createInvoiceTest() throws ApiException {
        InvoiceCreateRequest req = null;
        List<InvoiceResource> response = api.createInvoice(req);

        // TODO: test validations
    }
    
    /**
     * Lists available fulfillment statuses
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFulFillmentStatusesTest() throws ApiException {
        List<String> response = api.getFulFillmentStatuses();

        // TODO: test validations
    }
    
    /**
     * Retrieve an invoice
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInvoiceTest() throws ApiException {
        Integer id = null;
        InvoiceResource response = api.getInvoice(id);

        // TODO: test validations
    }
    
    /**
     * List invoice logs
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInvoiceLogsTest() throws ApiException {
        Integer id = null;
        Integer size = null;
        Integer page = null;
        PageResourceInvoiceLogEntry response = api.getInvoiceLogs(id, size, page);

        // TODO: test validations
    }
    
    /**
     * Retrieve invoices
     *
     * Without INVOICES_ADMIN permission the results are automatically filtered for only the logged in user&#39;s invoices. It is recomended however that filter_user be added to avoid issues for admin users accidentally getting additional invoices.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInvoicesTest() throws ApiException {
        Integer filterUser = null;
        String filterEmail = null;
        String filterFulfillmentStatus = null;
        String filterPaymentStatus = null;
        String filterItemName = null;
        String filterExternalRef = null;
        String filterCreatedDate = null;
        String filterVendorIds = null;
        String filterCurrency = null;
        String filterShippingStateName = null;
        String filterShippingCountryName = null;
        Float filterShipping = null;
        String filterVendorName = null;
        String filterSku = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        PageResourceInvoiceResource response = api.getInvoices(filterUser, filterEmail, filterFulfillmentStatus, filterPaymentStatus, filterItemName, filterExternalRef, filterCreatedDate, filterVendorIds, filterCurrency, filterShippingStateName, filterShippingCountryName, filterShipping, filterVendorName, filterSku, size, page, order);

        // TODO: test validations
    }
    
    /**
     * Lists available payment statuses
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPaymentStatusesTest() throws ApiException {
        List<String> response = api.getPaymentStatuses();

        // TODO: test validations
    }
    
    /**
     * Trigger payment of an invoice
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void payInvoiceTest() throws ApiException {
        Integer id = null;
        PayBySavedMethodRequest request = null;
        api.payInvoice(id, request);

        // TODO: test validations
    }
    
    /**
     * Set the external reference of an invoice
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setExternalRefTest() throws ApiException {
        Integer id = null;
        String externalRef = null;
        api.setExternalRef(id, externalRef);

        // TODO: test validations
    }
    
    /**
     * Set the fulfillment status of an invoice item
     *
     * This allows external fulfillment systems to report success or failure. Fulfillment status changes are restricted by a specific flow determining which status can lead to which.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setInvoiceItemFulfillmentStatusTest() throws ApiException {
        Integer id = null;
        String sku = null;
        String status = null;
        api.setInvoiceItemFulfillmentStatus(id, sku, status);

        // TODO: test validations
    }
    
    /**
     * Set the order notes of an invoice
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setOrderNotesTest() throws ApiException {
        Integer id = null;
        String orderNotes = null;
        api.setOrderNotes(id, orderNotes);

        // TODO: test validations
    }
    
    /**
     * Set the payment status of an invoice
     *
     * This may trigger fulfillment if setting the status to &#39;paid&#39;. This is mainly intended to support external payment systems that cannot be incorporated into the payment method system. Payment status changes are restricted by a specific flow determining which status can lead to which.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setPaymentStatusTest() throws ApiException {
        Integer id = null;
        InvoicePaymentStatusRequest request = null;
        api.setPaymentStatus(id, request);

        // TODO: test validations
    }
    
    /**
     * Set or update billing info
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateBillingInfoTest() throws ApiException {
        Integer id = null;
        AddressResource billingInfoRequest = null;
        api.updateBillingInfo(id, billingInfoRequest);

        // TODO: test validations
    }
    
}
