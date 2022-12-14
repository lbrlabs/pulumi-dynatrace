// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CustomServiceRuleClass {
    private @Nullable String match;
    /**
     * @return The name of the custom service, displayed in the UI
     * 
     */
    private String name;

    private CustomServiceRuleClass() {}
    public Optional<String> match() {
        return Optional.ofNullable(this.match);
    }
    /**
     * @return The name of the custom service, displayed in the UI
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomServiceRuleClass defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String match;
        private String name;
        public Builder() {}
        public Builder(CustomServiceRuleClass defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.match = defaults.match;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder match(@Nullable String match) {
            this.match = match;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public CustomServiceRuleClass build() {
            final var o = new CustomServiceRuleClass();
            o.match = match;
            o.name = name;
            return o;
        }
    }
}
