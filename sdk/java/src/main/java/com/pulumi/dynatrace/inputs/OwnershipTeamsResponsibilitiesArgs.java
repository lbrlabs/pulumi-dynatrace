// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class OwnershipTeamsResponsibilitiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final OwnershipTeamsResponsibilitiesArgs Empty = new OwnershipTeamsResponsibilitiesArgs();

    /**
     * Responsible for developing and maintaining high quality software. Development teams are responsible for making code changes to address performance regressions, errors, or security vulnerabilities.
     * 
     */
    @Import(name="development", required=true)
    private Output<Boolean> development;

    /**
     * @return Responsible for developing and maintaining high quality software. Development teams are responsible for making code changes to address performance regressions, errors, or security vulnerabilities.
     * 
     */
    public Output<Boolean> development() {
        return this.development;
    }

    /**
     * Responsible for the administration, management, and support of the IT infrastructure including physical servers, virtualization, and cloud. Teams with infrastructure responsibility are responsible for addressing hardware issues, resource limits, and operating system vulnerabilities.
     * 
     */
    @Import(name="infrastructure", required=true)
    private Output<Boolean> infrastructure;

    /**
     * @return Responsible for the administration, management, and support of the IT infrastructure including physical servers, virtualization, and cloud. Teams with infrastructure responsibility are responsible for addressing hardware issues, resource limits, and operating system vulnerabilities.
     * 
     */
    public Output<Boolean> infrastructure() {
        return this.infrastructure;
    }

    /**
     * Responsible for ensuring that applications in development align with business needs and meet the usability requirements of users, stakeholders, customers, and external partners. Teams with line of business responsibility are responsible for understanding the customer experience and how it affects business goals.
     * 
     */
    @Import(name="lineOfBusiness", required=true)
    private Output<Boolean> lineOfBusiness;

    /**
     * @return Responsible for ensuring that applications in development align with business needs and meet the usability requirements of users, stakeholders, customers, and external partners. Teams with line of business responsibility are responsible for understanding the customer experience and how it affects business goals.
     * 
     */
    public Output<Boolean> lineOfBusiness() {
        return this.lineOfBusiness;
    }

    /**
     * Responsible for deploying and managing software, with a focus on high availability and performance. Teams with operations responsibilities needs to understand the impact, priority, and team responsible for addressing problems detected by Dynatrace.
     * 
     */
    @Import(name="operations", required=true)
    private Output<Boolean> operations;

    /**
     * @return Responsible for deploying and managing software, with a focus on high availability and performance. Teams with operations responsibilities needs to understand the impact, priority, and team responsible for addressing problems detected by Dynatrace.
     * 
     */
    public Output<Boolean> operations() {
        return this.operations;
    }

    /**
     * Responsible for the security posture of the organization. Teams with security responsibility must understand the impact, priority, and team responsible for addressing security vulnerabilities.
     * 
     */
    @Import(name="security", required=true)
    private Output<Boolean> security;

    /**
     * @return Responsible for the security posture of the organization. Teams with security responsibility must understand the impact, priority, and team responsible for addressing security vulnerabilities.
     * 
     */
    public Output<Boolean> security() {
        return this.security;
    }

    private OwnershipTeamsResponsibilitiesArgs() {}

    private OwnershipTeamsResponsibilitiesArgs(OwnershipTeamsResponsibilitiesArgs $) {
        this.development = $.development;
        this.infrastructure = $.infrastructure;
        this.lineOfBusiness = $.lineOfBusiness;
        this.operations = $.operations;
        this.security = $.security;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OwnershipTeamsResponsibilitiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OwnershipTeamsResponsibilitiesArgs $;

        public Builder() {
            $ = new OwnershipTeamsResponsibilitiesArgs();
        }

        public Builder(OwnershipTeamsResponsibilitiesArgs defaults) {
            $ = new OwnershipTeamsResponsibilitiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param development Responsible for developing and maintaining high quality software. Development teams are responsible for making code changes to address performance regressions, errors, or security vulnerabilities.
         * 
         * @return builder
         * 
         */
        public Builder development(Output<Boolean> development) {
            $.development = development;
            return this;
        }

        /**
         * @param development Responsible for developing and maintaining high quality software. Development teams are responsible for making code changes to address performance regressions, errors, or security vulnerabilities.
         * 
         * @return builder
         * 
         */
        public Builder development(Boolean development) {
            return development(Output.of(development));
        }

        /**
         * @param infrastructure Responsible for the administration, management, and support of the IT infrastructure including physical servers, virtualization, and cloud. Teams with infrastructure responsibility are responsible for addressing hardware issues, resource limits, and operating system vulnerabilities.
         * 
         * @return builder
         * 
         */
        public Builder infrastructure(Output<Boolean> infrastructure) {
            $.infrastructure = infrastructure;
            return this;
        }

        /**
         * @param infrastructure Responsible for the administration, management, and support of the IT infrastructure including physical servers, virtualization, and cloud. Teams with infrastructure responsibility are responsible for addressing hardware issues, resource limits, and operating system vulnerabilities.
         * 
         * @return builder
         * 
         */
        public Builder infrastructure(Boolean infrastructure) {
            return infrastructure(Output.of(infrastructure));
        }

        /**
         * @param lineOfBusiness Responsible for ensuring that applications in development align with business needs and meet the usability requirements of users, stakeholders, customers, and external partners. Teams with line of business responsibility are responsible for understanding the customer experience and how it affects business goals.
         * 
         * @return builder
         * 
         */
        public Builder lineOfBusiness(Output<Boolean> lineOfBusiness) {
            $.lineOfBusiness = lineOfBusiness;
            return this;
        }

        /**
         * @param lineOfBusiness Responsible for ensuring that applications in development align with business needs and meet the usability requirements of users, stakeholders, customers, and external partners. Teams with line of business responsibility are responsible for understanding the customer experience and how it affects business goals.
         * 
         * @return builder
         * 
         */
        public Builder lineOfBusiness(Boolean lineOfBusiness) {
            return lineOfBusiness(Output.of(lineOfBusiness));
        }

        /**
         * @param operations Responsible for deploying and managing software, with a focus on high availability and performance. Teams with operations responsibilities needs to understand the impact, priority, and team responsible for addressing problems detected by Dynatrace.
         * 
         * @return builder
         * 
         */
        public Builder operations(Output<Boolean> operations) {
            $.operations = operations;
            return this;
        }

        /**
         * @param operations Responsible for deploying and managing software, with a focus on high availability and performance. Teams with operations responsibilities needs to understand the impact, priority, and team responsible for addressing problems detected by Dynatrace.
         * 
         * @return builder
         * 
         */
        public Builder operations(Boolean operations) {
            return operations(Output.of(operations));
        }

        /**
         * @param security Responsible for the security posture of the organization. Teams with security responsibility must understand the impact, priority, and team responsible for addressing security vulnerabilities.
         * 
         * @return builder
         * 
         */
        public Builder security(Output<Boolean> security) {
            $.security = security;
            return this;
        }

        /**
         * @param security Responsible for the security posture of the organization. Teams with security responsibility must understand the impact, priority, and team responsible for addressing security vulnerabilities.
         * 
         * @return builder
         * 
         */
        public Builder security(Boolean security) {
            return security(Output.of(security));
        }

        public OwnershipTeamsResponsibilitiesArgs build() {
            $.development = Objects.requireNonNull($.development, "expected parameter 'development' to be non-null");
            $.infrastructure = Objects.requireNonNull($.infrastructure, "expected parameter 'infrastructure' to be non-null");
            $.lineOfBusiness = Objects.requireNonNull($.lineOfBusiness, "expected parameter 'lineOfBusiness' to be non-null");
            $.operations = Objects.requireNonNull($.operations, "expected parameter 'operations' to be non-null");
            $.security = Objects.requireNonNull($.security, "expected parameter 'security' to be non-null");
            return $;
        }
    }

}
