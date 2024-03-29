// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.RumProviderBreakdownDomainNamePatternListArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RumProviderBreakdownArgs extends com.pulumi.resources.ResourceArgs {

    public static final RumProviderBreakdownArgs Empty = new RumProviderBreakdownArgs();

    /**
     * Domain name pattern
     * 
     */
    @Import(name="domainNamePatternList", required=true)
    private Output<RumProviderBreakdownDomainNamePatternListArgs> domainNamePatternList;

    /**
     * @return Domain name pattern
     * 
     */
    public Output<RumProviderBreakdownDomainNamePatternListArgs> domainNamePatternList() {
        return this.domainNamePatternList;
    }

    /**
     * Specify an URL for the provider&#39;s brand icon
     * 
     */
    @Import(name="iconUrl")
    private @Nullable Output<String> iconUrl;

    /**
     * @return Specify an URL for the provider&#39;s brand icon
     * 
     */
    public Optional<Output<String>> iconUrl() {
        return Optional.ofNullable(this.iconUrl);
    }

    /**
     * Send the patterns of this provider to Dynatrace to help us improve 3rd-party detection.
     * 
     */
    @Import(name="reportPublicImprovement", required=true)
    private Output<Boolean> reportPublicImprovement;

    /**
     * @return Send the patterns of this provider to Dynatrace to help us improve 3rd-party detection.
     * 
     */
    public Output<Boolean> reportPublicImprovement() {
        return this.reportPublicImprovement;
    }

    /**
     * Resource name
     * 
     */
    @Import(name="resourceName", required=true)
    private Output<String> resourceName;

    /**
     * @return Resource name
     * 
     */
    public Output<String> resourceName() {
        return this.resourceName;
    }

    /**
     * Possible Values: `FirstParty`, `ThirdParty`, `Cdn`
     * 
     */
    @Import(name="resourceType", required=true)
    private Output<String> resourceType;

    /**
     * @return Possible Values: `FirstParty`, `ThirdParty`, `Cdn`
     * 
     */
    public Output<String> resourceType() {
        return this.resourceType;
    }

    private RumProviderBreakdownArgs() {}

    private RumProviderBreakdownArgs(RumProviderBreakdownArgs $) {
        this.domainNamePatternList = $.domainNamePatternList;
        this.iconUrl = $.iconUrl;
        this.reportPublicImprovement = $.reportPublicImprovement;
        this.resourceName = $.resourceName;
        this.resourceType = $.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RumProviderBreakdownArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RumProviderBreakdownArgs $;

        public Builder() {
            $ = new RumProviderBreakdownArgs();
        }

        public Builder(RumProviderBreakdownArgs defaults) {
            $ = new RumProviderBreakdownArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param domainNamePatternList Domain name pattern
         * 
         * @return builder
         * 
         */
        public Builder domainNamePatternList(Output<RumProviderBreakdownDomainNamePatternListArgs> domainNamePatternList) {
            $.domainNamePatternList = domainNamePatternList;
            return this;
        }

        /**
         * @param domainNamePatternList Domain name pattern
         * 
         * @return builder
         * 
         */
        public Builder domainNamePatternList(RumProviderBreakdownDomainNamePatternListArgs domainNamePatternList) {
            return domainNamePatternList(Output.of(domainNamePatternList));
        }

        /**
         * @param iconUrl Specify an URL for the provider&#39;s brand icon
         * 
         * @return builder
         * 
         */
        public Builder iconUrl(@Nullable Output<String> iconUrl) {
            $.iconUrl = iconUrl;
            return this;
        }

        /**
         * @param iconUrl Specify an URL for the provider&#39;s brand icon
         * 
         * @return builder
         * 
         */
        public Builder iconUrl(String iconUrl) {
            return iconUrl(Output.of(iconUrl));
        }

        /**
         * @param reportPublicImprovement Send the patterns of this provider to Dynatrace to help us improve 3rd-party detection.
         * 
         * @return builder
         * 
         */
        public Builder reportPublicImprovement(Output<Boolean> reportPublicImprovement) {
            $.reportPublicImprovement = reportPublicImprovement;
            return this;
        }

        /**
         * @param reportPublicImprovement Send the patterns of this provider to Dynatrace to help us improve 3rd-party detection.
         * 
         * @return builder
         * 
         */
        public Builder reportPublicImprovement(Boolean reportPublicImprovement) {
            return reportPublicImprovement(Output.of(reportPublicImprovement));
        }

        /**
         * @param resourceName Resource name
         * 
         * @return builder
         * 
         */
        public Builder resourceName(Output<String> resourceName) {
            $.resourceName = resourceName;
            return this;
        }

        /**
         * @param resourceName Resource name
         * 
         * @return builder
         * 
         */
        public Builder resourceName(String resourceName) {
            return resourceName(Output.of(resourceName));
        }

        /**
         * @param resourceType Possible Values: `FirstParty`, `ThirdParty`, `Cdn`
         * 
         * @return builder
         * 
         */
        public Builder resourceType(Output<String> resourceType) {
            $.resourceType = resourceType;
            return this;
        }

        /**
         * @param resourceType Possible Values: `FirstParty`, `ThirdParty`, `Cdn`
         * 
         * @return builder
         * 
         */
        public Builder resourceType(String resourceType) {
            return resourceType(Output.of(resourceType));
        }

        public RumProviderBreakdownArgs build() {
            $.domainNamePatternList = Objects.requireNonNull($.domainNamePatternList, "expected parameter 'domainNamePatternList' to be non-null");
            $.reportPublicImprovement = Objects.requireNonNull($.reportPublicImprovement, "expected parameter 'reportPublicImprovement' to be non-null");
            $.resourceName = Objects.requireNonNull($.resourceName, "expected parameter 'resourceName' to be non-null");
            $.resourceType = Objects.requireNonNull($.resourceType, "expected parameter 'resourceType' to be non-null");
            return $;
        }
    }

}
