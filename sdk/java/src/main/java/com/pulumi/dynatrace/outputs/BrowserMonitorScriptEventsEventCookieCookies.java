// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.BrowserMonitorScriptEventsEventCookieCookiesCookie;
import java.util.List;
import java.util.Objects;

@CustomType
public final class BrowserMonitorScriptEventsEventCookieCookies {
    private List<BrowserMonitorScriptEventsEventCookieCookiesCookie> cookies;

    private BrowserMonitorScriptEventsEventCookieCookies() {}
    public List<BrowserMonitorScriptEventsEventCookieCookiesCookie> cookies() {
        return this.cookies;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BrowserMonitorScriptEventsEventCookieCookies defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<BrowserMonitorScriptEventsEventCookieCookiesCookie> cookies;
        public Builder() {}
        public Builder(BrowserMonitorScriptEventsEventCookieCookies defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cookies = defaults.cookies;
        }

        @CustomType.Setter
        public Builder cookies(List<BrowserMonitorScriptEventsEventCookieCookiesCookie> cookies) {
            this.cookies = Objects.requireNonNull(cookies);
            return this;
        }
        public Builder cookies(BrowserMonitorScriptEventsEventCookieCookiesCookie... cookies) {
            return cookies(List.of(cookies));
        }
        public BrowserMonitorScriptEventsEventCookieCookies build() {
            final var o = new BrowserMonitorScriptEventsEventCookieCookies();
            o.cookies = cookies;
            return o;
        }
    }
}
