// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.ServiceHttpFailureBrokenLinksArgs;
import com.pulumi.dynatrace.inputs.ServiceHttpFailureHttpResponseCodesArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceHttpFailureState extends com.pulumi.resources.ResourceArgs {

    public static final ServiceHttpFailureState Empty = new ServiceHttpFailureState();

    /**
     * HTTP 404 response codes are thrown when a web server can&#39;t find a certain page. 404s are classified as broken links on the client side and therefore aren&#39;t considered to be service failures. By enabling this setting, you can have 404s treated as server-side service failures.
     * 
     */
    @Import(name="brokenLinks")
    private @Nullable Output<ServiceHttpFailureBrokenLinksArgs> brokenLinks;

    /**
     * @return HTTP 404 response codes are thrown when a web server can&#39;t find a certain page. 404s are classified as broken links on the client side and therefore aren&#39;t considered to be service failures. By enabling this setting, you can have 404s treated as server-side service failures.
     * 
     */
    public Optional<Output<ServiceHttpFailureBrokenLinksArgs>> brokenLinks() {
        return Optional.ofNullable(this.brokenLinks);
    }

    /**
     * This setting is enabled (`true`) or disabled (`false`)
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return This setting is enabled (`true`) or disabled (`false`)
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * HTTP response codes
     * 
     */
    @Import(name="httpResponseCodes")
    private @Nullable Output<ServiceHttpFailureHttpResponseCodesArgs> httpResponseCodes;

    /**
     * @return HTTP response codes
     * 
     */
    public Optional<Output<ServiceHttpFailureHttpResponseCodesArgs>> httpResponseCodes() {
        return Optional.ofNullable(this.httpResponseCodes);
    }

    /**
     * The scope of this settings. If the settings should cover the whole environment, just don&#39;t specify any scope.
     * 
     */
    @Import(name="serviceId")
    private @Nullable Output<String> serviceId;

    /**
     * @return The scope of this settings. If the settings should cover the whole environment, just don&#39;t specify any scope.
     * 
     */
    public Optional<Output<String>> serviceId() {
        return Optional.ofNullable(this.serviceId);
    }

    private ServiceHttpFailureState() {}

    private ServiceHttpFailureState(ServiceHttpFailureState $) {
        this.brokenLinks = $.brokenLinks;
        this.enabled = $.enabled;
        this.httpResponseCodes = $.httpResponseCodes;
        this.serviceId = $.serviceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceHttpFailureState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceHttpFailureState $;

        public Builder() {
            $ = new ServiceHttpFailureState();
        }

        public Builder(ServiceHttpFailureState defaults) {
            $ = new ServiceHttpFailureState(Objects.requireNonNull(defaults));
        }

        /**
         * @param brokenLinks HTTP 404 response codes are thrown when a web server can&#39;t find a certain page. 404s are classified as broken links on the client side and therefore aren&#39;t considered to be service failures. By enabling this setting, you can have 404s treated as server-side service failures.
         * 
         * @return builder
         * 
         */
        public Builder brokenLinks(@Nullable Output<ServiceHttpFailureBrokenLinksArgs> brokenLinks) {
            $.brokenLinks = brokenLinks;
            return this;
        }

        /**
         * @param brokenLinks HTTP 404 response codes are thrown when a web server can&#39;t find a certain page. 404s are classified as broken links on the client side and therefore aren&#39;t considered to be service failures. By enabling this setting, you can have 404s treated as server-side service failures.
         * 
         * @return builder
         * 
         */
        public Builder brokenLinks(ServiceHttpFailureBrokenLinksArgs brokenLinks) {
            return brokenLinks(Output.of(brokenLinks));
        }

        /**
         * @param enabled This setting is enabled (`true`) or disabled (`false`)
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled This setting is enabled (`true`) or disabled (`false`)
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param httpResponseCodes HTTP response codes
         * 
         * @return builder
         * 
         */
        public Builder httpResponseCodes(@Nullable Output<ServiceHttpFailureHttpResponseCodesArgs> httpResponseCodes) {
            $.httpResponseCodes = httpResponseCodes;
            return this;
        }

        /**
         * @param httpResponseCodes HTTP response codes
         * 
         * @return builder
         * 
         */
        public Builder httpResponseCodes(ServiceHttpFailureHttpResponseCodesArgs httpResponseCodes) {
            return httpResponseCodes(Output.of(httpResponseCodes));
        }

        /**
         * @param serviceId The scope of this settings. If the settings should cover the whole environment, just don&#39;t specify any scope.
         * 
         * @return builder
         * 
         */
        public Builder serviceId(@Nullable Output<String> serviceId) {
            $.serviceId = serviceId;
            return this;
        }

        /**
         * @param serviceId The scope of this settings. If the settings should cover the whole environment, just don&#39;t specify any scope.
         * 
         * @return builder
         * 
         */
        public Builder serviceId(String serviceId) {
            return serviceId(Output.of(serviceId));
        }

        public ServiceHttpFailureState build() {
            return $;
        }
    }

}
