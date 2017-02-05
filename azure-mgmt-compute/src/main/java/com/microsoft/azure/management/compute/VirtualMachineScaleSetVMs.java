package com.microsoft.azure.management.compute;

import com.microsoft.azure.management.apigeneration.Fluent;
import com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetVMsInner;
import com.microsoft.azure.management.resources.fluentcore.collection.SupportsListing;
import com.microsoft.azure.management.resources.fluentcore.model.HasInner;

/**
 *  Entry point to virtual machine scale set instance management API.
 */
@Fluent
public interface VirtualMachineScaleSetVMs extends
    SupportsListing<VirtualMachineScaleSetVM>,
    HasInner<VirtualMachineScaleSetVMsInner> {
}
