// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.OsServicesMetadataItemArgs;
import java.util.List;
import java.util.Objects;


public final class OsServicesMetadataArgs extends com.pulumi.resources.ResourceArgs {

    public static final OsServicesMetadataArgs Empty = new OsServicesMetadataArgs();

    @Import(name="items", required=true)
    private Output<List<OsServicesMetadataItemArgs>> items;

    public Output<List<OsServicesMetadataItemArgs>> items() {
        return this.items;
    }

    private OsServicesMetadataArgs() {}

    private OsServicesMetadataArgs(OsServicesMetadataArgs $) {
        this.items = $.items;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OsServicesMetadataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OsServicesMetadataArgs $;

        public Builder() {
            $ = new OsServicesMetadataArgs();
        }

        public Builder(OsServicesMetadataArgs defaults) {
            $ = new OsServicesMetadataArgs(Objects.requireNonNull(defaults));
        }

        public Builder items(Output<List<OsServicesMetadataItemArgs>> items) {
            $.items = items;
            return this;
        }

        public Builder items(List<OsServicesMetadataItemArgs> items) {
            return items(Output.of(items));
        }

        public Builder items(OsServicesMetadataItemArgs... items) {
            return items(List.of(items));
        }

        public OsServicesMetadataArgs build() {
            $.items = Objects.requireNonNull($.items, "expected parameter 'items' to be non-null");
            return $;
        }
    }

}
