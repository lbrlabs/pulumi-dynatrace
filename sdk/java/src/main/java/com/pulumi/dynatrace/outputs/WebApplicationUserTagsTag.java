// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WebApplicationUserTagsTag {
    private @Nullable String cleanupRule;
    /**
     * @return The ID of this resource.
     * 
     */
    private Integer id;
    private @Nullable Boolean ignoreCase;
    private @Nullable Integer metadataId;
    private @Nullable String serverSideRequestAttribute;

    private WebApplicationUserTagsTag() {}
    public Optional<String> cleanupRule() {
        return Optional.ofNullable(this.cleanupRule);
    }
    /**
     * @return The ID of this resource.
     * 
     */
    public Integer id() {
        return this.id;
    }
    public Optional<Boolean> ignoreCase() {
        return Optional.ofNullable(this.ignoreCase);
    }
    public Optional<Integer> metadataId() {
        return Optional.ofNullable(this.metadataId);
    }
    public Optional<String> serverSideRequestAttribute() {
        return Optional.ofNullable(this.serverSideRequestAttribute);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebApplicationUserTagsTag defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String cleanupRule;
        private Integer id;
        private @Nullable Boolean ignoreCase;
        private @Nullable Integer metadataId;
        private @Nullable String serverSideRequestAttribute;
        public Builder() {}
        public Builder(WebApplicationUserTagsTag defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cleanupRule = defaults.cleanupRule;
    	      this.id = defaults.id;
    	      this.ignoreCase = defaults.ignoreCase;
    	      this.metadataId = defaults.metadataId;
    	      this.serverSideRequestAttribute = defaults.serverSideRequestAttribute;
        }

        @CustomType.Setter
        public Builder cleanupRule(@Nullable String cleanupRule) {
            this.cleanupRule = cleanupRule;
            return this;
        }
        @CustomType.Setter
        public Builder id(Integer id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder ignoreCase(@Nullable Boolean ignoreCase) {
            this.ignoreCase = ignoreCase;
            return this;
        }
        @CustomType.Setter
        public Builder metadataId(@Nullable Integer metadataId) {
            this.metadataId = metadataId;
            return this;
        }
        @CustomType.Setter
        public Builder serverSideRequestAttribute(@Nullable String serverSideRequestAttribute) {
            this.serverSideRequestAttribute = serverSideRequestAttribute;
            return this;
        }
        public WebApplicationUserTagsTag build() {
            final var o = new WebApplicationUserTagsTag();
            o.cleanupRule = cleanupRule;
            o.id = id;
            o.ignoreCase = ignoreCase;
            o.metadataId = metadataId;
            o.serverSideRequestAttribute = serverSideRequestAttribute;
            return o;
        }
    }
}
