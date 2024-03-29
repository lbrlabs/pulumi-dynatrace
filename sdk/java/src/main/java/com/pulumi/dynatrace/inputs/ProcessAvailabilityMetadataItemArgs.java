// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ProcessAvailabilityMetadataItemArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProcessAvailabilityMetadataItemArgs Empty = new ProcessAvailabilityMetadataItemArgs();

    @Import(name="key", required=true)
    private Output<String> key;

    public Output<String> key() {
        return this.key;
    }

    @Import(name="value", required=true)
    private Output<String> value;

    public Output<String> value() {
        return this.value;
    }

    private ProcessAvailabilityMetadataItemArgs() {}

    private ProcessAvailabilityMetadataItemArgs(ProcessAvailabilityMetadataItemArgs $) {
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProcessAvailabilityMetadataItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProcessAvailabilityMetadataItemArgs $;

        public Builder() {
            $ = new ProcessAvailabilityMetadataItemArgs();
        }

        public Builder(ProcessAvailabilityMetadataItemArgs defaults) {
            $ = new ProcessAvailabilityMetadataItemArgs(Objects.requireNonNull(defaults));
        }

        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        public Builder key(String key) {
            return key(Output.of(key));
        }

        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public ProcessAvailabilityMetadataItemArgs build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
