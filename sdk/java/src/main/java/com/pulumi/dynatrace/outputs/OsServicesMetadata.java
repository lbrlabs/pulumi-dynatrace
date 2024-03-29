// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.OsServicesMetadataItem;
import java.util.List;
import java.util.Objects;

@CustomType
public final class OsServicesMetadata {
    private List<OsServicesMetadataItem> items;

    private OsServicesMetadata() {}
    public List<OsServicesMetadataItem> items() {
        return this.items;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OsServicesMetadata defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<OsServicesMetadataItem> items;
        public Builder() {}
        public Builder(OsServicesMetadata defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        @CustomType.Setter
        public Builder items(List<OsServicesMetadataItem> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }
        public Builder items(OsServicesMetadataItem... items) {
            return items(List.of(items));
        }
        public OsServicesMetadata build() {
            final var o = new OsServicesMetadata();
            o.items = items;
            return o;
        }
    }
}
