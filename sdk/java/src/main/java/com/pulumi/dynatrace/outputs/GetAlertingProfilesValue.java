// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAlertingProfilesValue {
    /**
     * @return The ID of this resource.
     * 
     */
    private String id;
    private String legacyId;
    private String managementZoneId;
    private String managementZoneLegacyId;
    private String name;

    private GetAlertingProfilesValue() {}
    /**
     * @return The ID of this resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String legacyId() {
        return this.legacyId;
    }
    public String managementZoneId() {
        return this.managementZoneId;
    }
    public String managementZoneLegacyId() {
        return this.managementZoneLegacyId;
    }
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAlertingProfilesValue defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String legacyId;
        private String managementZoneId;
        private String managementZoneLegacyId;
        private String name;
        public Builder() {}
        public Builder(GetAlertingProfilesValue defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.legacyId = defaults.legacyId;
    	      this.managementZoneId = defaults.managementZoneId;
    	      this.managementZoneLegacyId = defaults.managementZoneLegacyId;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder legacyId(String legacyId) {
            this.legacyId = Objects.requireNonNull(legacyId);
            return this;
        }
        @CustomType.Setter
        public Builder managementZoneId(String managementZoneId) {
            this.managementZoneId = Objects.requireNonNull(managementZoneId);
            return this;
        }
        @CustomType.Setter
        public Builder managementZoneLegacyId(String managementZoneLegacyId) {
            this.managementZoneLegacyId = Objects.requireNonNull(managementZoneLegacyId);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public GetAlertingProfilesValue build() {
            final var o = new GetAlertingProfilesValue();
            o.id = id;
            o.legacyId = legacyId;
            o.managementZoneId = managementZoneId;
            o.managementZoneLegacyId = managementZoneLegacyId;
            o.name = name;
            return o;
        }
    }
}
