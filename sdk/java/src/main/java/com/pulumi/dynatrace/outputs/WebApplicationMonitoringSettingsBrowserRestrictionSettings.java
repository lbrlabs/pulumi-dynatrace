// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.WebApplicationMonitoringSettingsBrowserRestrictionSettingsRestrictions;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WebApplicationMonitoringSettingsBrowserRestrictionSettings {
    private String mode;
    private @Nullable WebApplicationMonitoringSettingsBrowserRestrictionSettingsRestrictions restrictions;

    private WebApplicationMonitoringSettingsBrowserRestrictionSettings() {}
    public String mode() {
        return this.mode;
    }
    public Optional<WebApplicationMonitoringSettingsBrowserRestrictionSettingsRestrictions> restrictions() {
        return Optional.ofNullable(this.restrictions);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebApplicationMonitoringSettingsBrowserRestrictionSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String mode;
        private @Nullable WebApplicationMonitoringSettingsBrowserRestrictionSettingsRestrictions restrictions;
        public Builder() {}
        public Builder(WebApplicationMonitoringSettingsBrowserRestrictionSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mode = defaults.mode;
    	      this.restrictions = defaults.restrictions;
        }

        @CustomType.Setter
        public Builder mode(String mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }
        @CustomType.Setter
        public Builder restrictions(@Nullable WebApplicationMonitoringSettingsBrowserRestrictionSettingsRestrictions restrictions) {
            this.restrictions = restrictions;
            return this;
        }
        public WebApplicationMonitoringSettingsBrowserRestrictionSettings build() {
            final var o = new WebApplicationMonitoringSettingsBrowserRestrictionSettings();
            o.mode = mode;
            o.restrictions = restrictions;
            return o;
        }
    }
}
