// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.WebApplicationMetaDataCaptureSettingsCapture;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class WebApplicationMetaDataCaptureSettings {
    /**
     * @return Java script agent meta data capture settings
     * 
     */
    private @Nullable List<WebApplicationMetaDataCaptureSettingsCapture> captures;

    private WebApplicationMetaDataCaptureSettings() {}
    /**
     * @return Java script agent meta data capture settings
     * 
     */
    public List<WebApplicationMetaDataCaptureSettingsCapture> captures() {
        return this.captures == null ? List.of() : this.captures;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebApplicationMetaDataCaptureSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<WebApplicationMetaDataCaptureSettingsCapture> captures;
        public Builder() {}
        public Builder(WebApplicationMetaDataCaptureSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.captures = defaults.captures;
        }

        @CustomType.Setter
        public Builder captures(@Nullable List<WebApplicationMetaDataCaptureSettingsCapture> captures) {
            this.captures = captures;
            return this;
        }
        public Builder captures(WebApplicationMetaDataCaptureSettingsCapture... captures) {
            return captures(List.of(captures));
        }
        public WebApplicationMetaDataCaptureSettings build() {
            final var o = new WebApplicationMetaDataCaptureSettings();
            o.captures = captures;
            return o;
        }
    }
}
