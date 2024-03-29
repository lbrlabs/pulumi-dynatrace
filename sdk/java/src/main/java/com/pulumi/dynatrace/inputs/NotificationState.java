// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.NotificationAnsibleTowerArgs;
import com.pulumi.dynatrace.inputs.NotificationConfigArgs;
import com.pulumi.dynatrace.inputs.NotificationEmailArgs;
import com.pulumi.dynatrace.inputs.NotificationJiraArgs;
import com.pulumi.dynatrace.inputs.NotificationOpsGenieArgs;
import com.pulumi.dynatrace.inputs.NotificationPagerDutyArgs;
import com.pulumi.dynatrace.inputs.NotificationServiceNowArgs;
import com.pulumi.dynatrace.inputs.NotificationSlackArgs;
import com.pulumi.dynatrace.inputs.NotificationTrelloArgs;
import com.pulumi.dynatrace.inputs.NotificationVictorOpsArgs;
import com.pulumi.dynatrace.inputs.NotificationWebHookArgs;
import com.pulumi.dynatrace.inputs.NotificationXmattersArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NotificationState extends com.pulumi.resources.ResourceArgs {

    public static final NotificationState Empty = new NotificationState();

    /**
     * Configuration for Ansible Tower Notification
     * 
     */
    @Import(name="ansibleTower")
    private @Nullable Output<NotificationAnsibleTowerArgs> ansibleTower;

    /**
     * @return Configuration for Ansible Tower Notification
     * 
     */
    public Optional<Output<NotificationAnsibleTowerArgs>> ansibleTower() {
        return Optional.ofNullable(this.ansibleTower);
    }

    /**
     * Configuration for Generic Notification
     * 
     */
    @Import(name="config")
    private @Nullable Output<NotificationConfigArgs> config;

    /**
     * @return Configuration for Generic Notification
     * 
     */
    public Optional<Output<NotificationConfigArgs>> config() {
        return Optional.ofNullable(this.config);
    }

    /**
     * Configuration for Email Notification
     * 
     */
    @Import(name="email")
    private @Nullable Output<NotificationEmailArgs> email;

    /**
     * @return Configuration for Email Notification
     * 
     */
    public Optional<Output<NotificationEmailArgs>> email() {
        return Optional.ofNullable(this.email);
    }

    /**
     * Configuration for Jira Notification
     * 
     */
    @Import(name="jira")
    private @Nullable Output<NotificationJiraArgs> jira;

    /**
     * @return Configuration for Jira Notification
     * 
     */
    public Optional<Output<NotificationJiraArgs>> jira() {
        return Optional.ofNullable(this.jira);
    }

    /**
     * Configuration for OpsGenie Notification
     * 
     */
    @Import(name="opsGenie")
    private @Nullable Output<NotificationOpsGenieArgs> opsGenie;

    /**
     * @return Configuration for OpsGenie Notification
     * 
     */
    public Optional<Output<NotificationOpsGenieArgs>> opsGenie() {
        return Optional.ofNullable(this.opsGenie);
    }

    /**
     * Configuration for PagerDuty Notification
     * 
     */
    @Import(name="pagerDuty")
    private @Nullable Output<NotificationPagerDutyArgs> pagerDuty;

    /**
     * @return Configuration for PagerDuty Notification
     * 
     */
    public Optional<Output<NotificationPagerDutyArgs>> pagerDuty() {
        return Optional.ofNullable(this.pagerDuty);
    }

    /**
     * Configuration for ServiceNow Notification
     * 
     */
    @Import(name="serviceNow")
    private @Nullable Output<NotificationServiceNowArgs> serviceNow;

    /**
     * @return Configuration for ServiceNow Notification
     * 
     */
    public Optional<Output<NotificationServiceNowArgs>> serviceNow() {
        return Optional.ofNullable(this.serviceNow);
    }

    /**
     * Configuration for Slack Notification
     * 
     */
    @Import(name="slack")
    private @Nullable Output<NotificationSlackArgs> slack;

    /**
     * @return Configuration for Slack Notification
     * 
     */
    public Optional<Output<NotificationSlackArgs>> slack() {
        return Optional.ofNullable(this.slack);
    }

    /**
     * Configuration for Trello Notification
     * 
     */
    @Import(name="trello")
    private @Nullable Output<NotificationTrelloArgs> trello;

    /**
     * @return Configuration for Trello Notification
     * 
     */
    public Optional<Output<NotificationTrelloArgs>> trello() {
        return Optional.ofNullable(this.trello);
    }

    /**
     * Configuration for VictorOps Notification
     * 
     */
    @Import(name="victorOps")
    private @Nullable Output<NotificationVictorOpsArgs> victorOps;

    /**
     * @return Configuration for VictorOps Notification
     * 
     */
    public Optional<Output<NotificationVictorOpsArgs>> victorOps() {
        return Optional.ofNullable(this.victorOps);
    }

    /**
     * Configuration for WebHook Notification
     * 
     */
    @Import(name="webHook")
    private @Nullable Output<NotificationWebHookArgs> webHook;

    /**
     * @return Configuration for WebHook Notification
     * 
     */
    public Optional<Output<NotificationWebHookArgs>> webHook() {
        return Optional.ofNullable(this.webHook);
    }

    /**
     * Configuration for XMatters Notification
     * 
     */
    @Import(name="xmatters")
    private @Nullable Output<NotificationXmattersArgs> xmatters;

    /**
     * @return Configuration for XMatters Notification
     * 
     */
    public Optional<Output<NotificationXmattersArgs>> xmatters() {
        return Optional.ofNullable(this.xmatters);
    }

    private NotificationState() {}

    private NotificationState(NotificationState $) {
        this.ansibleTower = $.ansibleTower;
        this.config = $.config;
        this.email = $.email;
        this.jira = $.jira;
        this.opsGenie = $.opsGenie;
        this.pagerDuty = $.pagerDuty;
        this.serviceNow = $.serviceNow;
        this.slack = $.slack;
        this.trello = $.trello;
        this.victorOps = $.victorOps;
        this.webHook = $.webHook;
        this.xmatters = $.xmatters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NotificationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NotificationState $;

        public Builder() {
            $ = new NotificationState();
        }

        public Builder(NotificationState defaults) {
            $ = new NotificationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param ansibleTower Configuration for Ansible Tower Notification
         * 
         * @return builder
         * 
         */
        public Builder ansibleTower(@Nullable Output<NotificationAnsibleTowerArgs> ansibleTower) {
            $.ansibleTower = ansibleTower;
            return this;
        }

        /**
         * @param ansibleTower Configuration for Ansible Tower Notification
         * 
         * @return builder
         * 
         */
        public Builder ansibleTower(NotificationAnsibleTowerArgs ansibleTower) {
            return ansibleTower(Output.of(ansibleTower));
        }

        /**
         * @param config Configuration for Generic Notification
         * 
         * @return builder
         * 
         */
        public Builder config(@Nullable Output<NotificationConfigArgs> config) {
            $.config = config;
            return this;
        }

        /**
         * @param config Configuration for Generic Notification
         * 
         * @return builder
         * 
         */
        public Builder config(NotificationConfigArgs config) {
            return config(Output.of(config));
        }

        /**
         * @param email Configuration for Email Notification
         * 
         * @return builder
         * 
         */
        public Builder email(@Nullable Output<NotificationEmailArgs> email) {
            $.email = email;
            return this;
        }

        /**
         * @param email Configuration for Email Notification
         * 
         * @return builder
         * 
         */
        public Builder email(NotificationEmailArgs email) {
            return email(Output.of(email));
        }

        /**
         * @param jira Configuration for Jira Notification
         * 
         * @return builder
         * 
         */
        public Builder jira(@Nullable Output<NotificationJiraArgs> jira) {
            $.jira = jira;
            return this;
        }

        /**
         * @param jira Configuration for Jira Notification
         * 
         * @return builder
         * 
         */
        public Builder jira(NotificationJiraArgs jira) {
            return jira(Output.of(jira));
        }

        /**
         * @param opsGenie Configuration for OpsGenie Notification
         * 
         * @return builder
         * 
         */
        public Builder opsGenie(@Nullable Output<NotificationOpsGenieArgs> opsGenie) {
            $.opsGenie = opsGenie;
            return this;
        }

        /**
         * @param opsGenie Configuration for OpsGenie Notification
         * 
         * @return builder
         * 
         */
        public Builder opsGenie(NotificationOpsGenieArgs opsGenie) {
            return opsGenie(Output.of(opsGenie));
        }

        /**
         * @param pagerDuty Configuration for PagerDuty Notification
         * 
         * @return builder
         * 
         */
        public Builder pagerDuty(@Nullable Output<NotificationPagerDutyArgs> pagerDuty) {
            $.pagerDuty = pagerDuty;
            return this;
        }

        /**
         * @param pagerDuty Configuration for PagerDuty Notification
         * 
         * @return builder
         * 
         */
        public Builder pagerDuty(NotificationPagerDutyArgs pagerDuty) {
            return pagerDuty(Output.of(pagerDuty));
        }

        /**
         * @param serviceNow Configuration for ServiceNow Notification
         * 
         * @return builder
         * 
         */
        public Builder serviceNow(@Nullable Output<NotificationServiceNowArgs> serviceNow) {
            $.serviceNow = serviceNow;
            return this;
        }

        /**
         * @param serviceNow Configuration for ServiceNow Notification
         * 
         * @return builder
         * 
         */
        public Builder serviceNow(NotificationServiceNowArgs serviceNow) {
            return serviceNow(Output.of(serviceNow));
        }

        /**
         * @param slack Configuration for Slack Notification
         * 
         * @return builder
         * 
         */
        public Builder slack(@Nullable Output<NotificationSlackArgs> slack) {
            $.slack = slack;
            return this;
        }

        /**
         * @param slack Configuration for Slack Notification
         * 
         * @return builder
         * 
         */
        public Builder slack(NotificationSlackArgs slack) {
            return slack(Output.of(slack));
        }

        /**
         * @param trello Configuration for Trello Notification
         * 
         * @return builder
         * 
         */
        public Builder trello(@Nullable Output<NotificationTrelloArgs> trello) {
            $.trello = trello;
            return this;
        }

        /**
         * @param trello Configuration for Trello Notification
         * 
         * @return builder
         * 
         */
        public Builder trello(NotificationTrelloArgs trello) {
            return trello(Output.of(trello));
        }

        /**
         * @param victorOps Configuration for VictorOps Notification
         * 
         * @return builder
         * 
         */
        public Builder victorOps(@Nullable Output<NotificationVictorOpsArgs> victorOps) {
            $.victorOps = victorOps;
            return this;
        }

        /**
         * @param victorOps Configuration for VictorOps Notification
         * 
         * @return builder
         * 
         */
        public Builder victorOps(NotificationVictorOpsArgs victorOps) {
            return victorOps(Output.of(victorOps));
        }

        /**
         * @param webHook Configuration for WebHook Notification
         * 
         * @return builder
         * 
         */
        public Builder webHook(@Nullable Output<NotificationWebHookArgs> webHook) {
            $.webHook = webHook;
            return this;
        }

        /**
         * @param webHook Configuration for WebHook Notification
         * 
         * @return builder
         * 
         */
        public Builder webHook(NotificationWebHookArgs webHook) {
            return webHook(Output.of(webHook));
        }

        /**
         * @param xmatters Configuration for XMatters Notification
         * 
         * @return builder
         * 
         */
        public Builder xmatters(@Nullable Output<NotificationXmattersArgs> xmatters) {
            $.xmatters = xmatters;
            return this;
        }

        /**
         * @param xmatters Configuration for XMatters Notification
         * 
         * @return builder
         * 
         */
        public Builder xmatters(NotificationXmattersArgs xmatters) {
            return xmatters(Output.of(xmatters));
        }

        public NotificationState build() {
            return $;
        }
    }

}
