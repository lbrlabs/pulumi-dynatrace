// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.VmwareAnomaliesDroppedPacketsDetectionArgs;
import com.pulumi.dynatrace.inputs.VmwareAnomaliesEsxiHighCpuDetectionArgs;
import com.pulumi.dynatrace.inputs.VmwareAnomaliesEsxiHighMemoryDetectionArgs;
import com.pulumi.dynatrace.inputs.VmwareAnomaliesGuestCpuLimitDetectionArgs;
import com.pulumi.dynatrace.inputs.VmwareAnomaliesLowDatastoreSpaceDetectionArgs;
import com.pulumi.dynatrace.inputs.VmwareAnomaliesOverloadedStorageDetectionArgs;
import com.pulumi.dynatrace.inputs.VmwareAnomaliesSlowPhysicalStorageDetectionArgs;
import com.pulumi.dynatrace.inputs.VmwareAnomaliesUndersizedStorageDetectionArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VmwareAnomaliesState extends com.pulumi.resources.ResourceArgs {

    public static final VmwareAnomaliesState Empty = new VmwareAnomaliesState();

    /**
     * no documentation available
     * 
     */
    @Import(name="droppedPacketsDetection")
    private @Nullable Output<VmwareAnomaliesDroppedPacketsDetectionArgs> droppedPacketsDetection;

    /**
     * @return no documentation available
     * 
     */
    public Optional<Output<VmwareAnomaliesDroppedPacketsDetectionArgs>> droppedPacketsDetection() {
        return Optional.ofNullable(this.droppedPacketsDetection);
    }

    /**
     * no documentation available
     * 
     */
    @Import(name="esxiHighCpuDetection")
    private @Nullable Output<VmwareAnomaliesEsxiHighCpuDetectionArgs> esxiHighCpuDetection;

    /**
     * @return no documentation available
     * 
     */
    public Optional<Output<VmwareAnomaliesEsxiHighCpuDetectionArgs>> esxiHighCpuDetection() {
        return Optional.ofNullable(this.esxiHighCpuDetection);
    }

    /**
     * no documentation available
     * 
     */
    @Import(name="esxiHighMemoryDetection")
    private @Nullable Output<VmwareAnomaliesEsxiHighMemoryDetectionArgs> esxiHighMemoryDetection;

    /**
     * @return no documentation available
     * 
     */
    public Optional<Output<VmwareAnomaliesEsxiHighMemoryDetectionArgs>> esxiHighMemoryDetection() {
        return Optional.ofNullable(this.esxiHighMemoryDetection);
    }

    /**
     * no documentation available
     * 
     */
    @Import(name="guestCpuLimitDetection")
    private @Nullable Output<VmwareAnomaliesGuestCpuLimitDetectionArgs> guestCpuLimitDetection;

    /**
     * @return no documentation available
     * 
     */
    public Optional<Output<VmwareAnomaliesGuestCpuLimitDetectionArgs>> guestCpuLimitDetection() {
        return Optional.ofNullable(this.guestCpuLimitDetection);
    }

    /**
     * no documentation available
     * 
     */
    @Import(name="lowDatastoreSpaceDetection")
    private @Nullable Output<VmwareAnomaliesLowDatastoreSpaceDetectionArgs> lowDatastoreSpaceDetection;

    /**
     * @return no documentation available
     * 
     */
    public Optional<Output<VmwareAnomaliesLowDatastoreSpaceDetectionArgs>> lowDatastoreSpaceDetection() {
        return Optional.ofNullable(this.lowDatastoreSpaceDetection);
    }

    /**
     * no documentation available
     * 
     */
    @Import(name="overloadedStorageDetection")
    private @Nullable Output<VmwareAnomaliesOverloadedStorageDetectionArgs> overloadedStorageDetection;

    /**
     * @return no documentation available
     * 
     */
    public Optional<Output<VmwareAnomaliesOverloadedStorageDetectionArgs>> overloadedStorageDetection() {
        return Optional.ofNullable(this.overloadedStorageDetection);
    }

    /**
     * no documentation available
     * 
     */
    @Import(name="slowPhysicalStorageDetection")
    private @Nullable Output<VmwareAnomaliesSlowPhysicalStorageDetectionArgs> slowPhysicalStorageDetection;

    /**
     * @return no documentation available
     * 
     */
    public Optional<Output<VmwareAnomaliesSlowPhysicalStorageDetectionArgs>> slowPhysicalStorageDetection() {
        return Optional.ofNullable(this.slowPhysicalStorageDetection);
    }

    /**
     * no documentation available
     * 
     */
    @Import(name="undersizedStorageDetection")
    private @Nullable Output<VmwareAnomaliesUndersizedStorageDetectionArgs> undersizedStorageDetection;

    /**
     * @return no documentation available
     * 
     */
    public Optional<Output<VmwareAnomaliesUndersizedStorageDetectionArgs>> undersizedStorageDetection() {
        return Optional.ofNullable(this.undersizedStorageDetection);
    }

    private VmwareAnomaliesState() {}

    private VmwareAnomaliesState(VmwareAnomaliesState $) {
        this.droppedPacketsDetection = $.droppedPacketsDetection;
        this.esxiHighCpuDetection = $.esxiHighCpuDetection;
        this.esxiHighMemoryDetection = $.esxiHighMemoryDetection;
        this.guestCpuLimitDetection = $.guestCpuLimitDetection;
        this.lowDatastoreSpaceDetection = $.lowDatastoreSpaceDetection;
        this.overloadedStorageDetection = $.overloadedStorageDetection;
        this.slowPhysicalStorageDetection = $.slowPhysicalStorageDetection;
        this.undersizedStorageDetection = $.undersizedStorageDetection;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VmwareAnomaliesState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VmwareAnomaliesState $;

        public Builder() {
            $ = new VmwareAnomaliesState();
        }

        public Builder(VmwareAnomaliesState defaults) {
            $ = new VmwareAnomaliesState(Objects.requireNonNull(defaults));
        }

        /**
         * @param droppedPacketsDetection no documentation available
         * 
         * @return builder
         * 
         */
        public Builder droppedPacketsDetection(@Nullable Output<VmwareAnomaliesDroppedPacketsDetectionArgs> droppedPacketsDetection) {
            $.droppedPacketsDetection = droppedPacketsDetection;
            return this;
        }

        /**
         * @param droppedPacketsDetection no documentation available
         * 
         * @return builder
         * 
         */
        public Builder droppedPacketsDetection(VmwareAnomaliesDroppedPacketsDetectionArgs droppedPacketsDetection) {
            return droppedPacketsDetection(Output.of(droppedPacketsDetection));
        }

        /**
         * @param esxiHighCpuDetection no documentation available
         * 
         * @return builder
         * 
         */
        public Builder esxiHighCpuDetection(@Nullable Output<VmwareAnomaliesEsxiHighCpuDetectionArgs> esxiHighCpuDetection) {
            $.esxiHighCpuDetection = esxiHighCpuDetection;
            return this;
        }

        /**
         * @param esxiHighCpuDetection no documentation available
         * 
         * @return builder
         * 
         */
        public Builder esxiHighCpuDetection(VmwareAnomaliesEsxiHighCpuDetectionArgs esxiHighCpuDetection) {
            return esxiHighCpuDetection(Output.of(esxiHighCpuDetection));
        }

        /**
         * @param esxiHighMemoryDetection no documentation available
         * 
         * @return builder
         * 
         */
        public Builder esxiHighMemoryDetection(@Nullable Output<VmwareAnomaliesEsxiHighMemoryDetectionArgs> esxiHighMemoryDetection) {
            $.esxiHighMemoryDetection = esxiHighMemoryDetection;
            return this;
        }

        /**
         * @param esxiHighMemoryDetection no documentation available
         * 
         * @return builder
         * 
         */
        public Builder esxiHighMemoryDetection(VmwareAnomaliesEsxiHighMemoryDetectionArgs esxiHighMemoryDetection) {
            return esxiHighMemoryDetection(Output.of(esxiHighMemoryDetection));
        }

        /**
         * @param guestCpuLimitDetection no documentation available
         * 
         * @return builder
         * 
         */
        public Builder guestCpuLimitDetection(@Nullable Output<VmwareAnomaliesGuestCpuLimitDetectionArgs> guestCpuLimitDetection) {
            $.guestCpuLimitDetection = guestCpuLimitDetection;
            return this;
        }

        /**
         * @param guestCpuLimitDetection no documentation available
         * 
         * @return builder
         * 
         */
        public Builder guestCpuLimitDetection(VmwareAnomaliesGuestCpuLimitDetectionArgs guestCpuLimitDetection) {
            return guestCpuLimitDetection(Output.of(guestCpuLimitDetection));
        }

        /**
         * @param lowDatastoreSpaceDetection no documentation available
         * 
         * @return builder
         * 
         */
        public Builder lowDatastoreSpaceDetection(@Nullable Output<VmwareAnomaliesLowDatastoreSpaceDetectionArgs> lowDatastoreSpaceDetection) {
            $.lowDatastoreSpaceDetection = lowDatastoreSpaceDetection;
            return this;
        }

        /**
         * @param lowDatastoreSpaceDetection no documentation available
         * 
         * @return builder
         * 
         */
        public Builder lowDatastoreSpaceDetection(VmwareAnomaliesLowDatastoreSpaceDetectionArgs lowDatastoreSpaceDetection) {
            return lowDatastoreSpaceDetection(Output.of(lowDatastoreSpaceDetection));
        }

        /**
         * @param overloadedStorageDetection no documentation available
         * 
         * @return builder
         * 
         */
        public Builder overloadedStorageDetection(@Nullable Output<VmwareAnomaliesOverloadedStorageDetectionArgs> overloadedStorageDetection) {
            $.overloadedStorageDetection = overloadedStorageDetection;
            return this;
        }

        /**
         * @param overloadedStorageDetection no documentation available
         * 
         * @return builder
         * 
         */
        public Builder overloadedStorageDetection(VmwareAnomaliesOverloadedStorageDetectionArgs overloadedStorageDetection) {
            return overloadedStorageDetection(Output.of(overloadedStorageDetection));
        }

        /**
         * @param slowPhysicalStorageDetection no documentation available
         * 
         * @return builder
         * 
         */
        public Builder slowPhysicalStorageDetection(@Nullable Output<VmwareAnomaliesSlowPhysicalStorageDetectionArgs> slowPhysicalStorageDetection) {
            $.slowPhysicalStorageDetection = slowPhysicalStorageDetection;
            return this;
        }

        /**
         * @param slowPhysicalStorageDetection no documentation available
         * 
         * @return builder
         * 
         */
        public Builder slowPhysicalStorageDetection(VmwareAnomaliesSlowPhysicalStorageDetectionArgs slowPhysicalStorageDetection) {
            return slowPhysicalStorageDetection(Output.of(slowPhysicalStorageDetection));
        }

        /**
         * @param undersizedStorageDetection no documentation available
         * 
         * @return builder
         * 
         */
        public Builder undersizedStorageDetection(@Nullable Output<VmwareAnomaliesUndersizedStorageDetectionArgs> undersizedStorageDetection) {
            $.undersizedStorageDetection = undersizedStorageDetection;
            return this;
        }

        /**
         * @param undersizedStorageDetection no documentation available
         * 
         * @return builder
         * 
         */
        public Builder undersizedStorageDetection(VmwareAnomaliesUndersizedStorageDetectionArgs undersizedStorageDetection) {
            return undersizedStorageDetection(Output.of(undersizedStorageDetection));
        }

        public VmwareAnomaliesState build() {
            return $;
        }
    }

}