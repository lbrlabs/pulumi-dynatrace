// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.XmattersNotificationHeadersHeader;
import java.util.List;
import java.util.Objects;

@CustomType
public final class XmattersNotificationHeaders {
    /**
     * @return An additional HTTP Header to include when sending requests
     * 
     */
    private List<XmattersNotificationHeadersHeader> headers;

    private XmattersNotificationHeaders() {}
    /**
     * @return An additional HTTP Header to include when sending requests
     * 
     */
    public List<XmattersNotificationHeadersHeader> headers() {
        return this.headers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(XmattersNotificationHeaders defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<XmattersNotificationHeadersHeader> headers;
        public Builder() {}
        public Builder(XmattersNotificationHeaders defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headers = defaults.headers;
        }

        @CustomType.Setter
        public Builder headers(List<XmattersNotificationHeadersHeader> headers) {
            this.headers = Objects.requireNonNull(headers);
            return this;
        }
        public Builder headers(XmattersNotificationHeadersHeader... headers) {
            return headers(List.of(headers));
        }
        public XmattersNotificationHeaders build() {
            final var o = new XmattersNotificationHeaders();
            o.headers = headers;
            return o;
        }
    }
}
