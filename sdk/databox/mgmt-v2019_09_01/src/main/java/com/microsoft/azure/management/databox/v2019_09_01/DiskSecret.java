/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databox.v2019_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Contains all the secrets of a Disk.
 */
public class DiskSecret {
    /**
     * Serial number of the assigned disk.
     */
    @JsonProperty(value = "diskSerialNumber", access = JsonProperty.Access.WRITE_ONLY)
    private String diskSerialNumber;

    /**
     * Bit Locker key of the disk which can be used to unlock the disk to copy
     * data.
     */
    @JsonProperty(value = "bitLockerKey", access = JsonProperty.Access.WRITE_ONLY)
    private String bitLockerKey;

    /**
     * Get serial number of the assigned disk.
     *
     * @return the diskSerialNumber value
     */
    public String diskSerialNumber() {
        return this.diskSerialNumber;
    }

    /**
     * Get bit Locker key of the disk which can be used to unlock the disk to copy data.
     *
     * @return the bitLockerKey value
     */
    public String bitLockerKey() {
        return this.bitLockerKey;
    }

}