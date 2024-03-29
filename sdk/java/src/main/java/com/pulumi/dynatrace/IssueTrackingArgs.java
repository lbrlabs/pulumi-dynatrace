// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IssueTrackingArgs extends com.pulumi.resources.ResourceArgs {

    public static final IssueTrackingArgs Empty = new IssueTrackingArgs();

    /**
     * This setting is enabled (`true`) or disabled (`false`)
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return This setting is enabled (`true`) or disabled (`false`)
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    /**
     * Set a label to identify these issues, for example, `release_blocker` or `non-critical`
     * 
     */
    @Import(name="issuelabel", required=true)
    private Output<String> issuelabel;

    /**
     * @return Set a label to identify these issues, for example, `release_blocker` or `non-critical`
     * 
     */
    public Output<String> issuelabel() {
        return this.issuelabel;
    }

    /**
     * You can use the following placeholders to automatically insert values from the **Release monitoring** page in your query: `{NAME}`, `{VERSION}`, `{STAGE}`, `{PRODUCT}`.
     * 
     */
    @Import(name="issuequery", required=true)
    private Output<String> issuequery;

    /**
     * @return You can use the following placeholders to automatically insert values from the **Release monitoring** page in your query: `{NAME}`, `{VERSION}`, `{STAGE}`, `{PRODUCT}`.
     * 
     */
    public Output<String> issuequery() {
        return this.issuequery;
    }

    /**
     * Possible Values: `ERROR`, `INFO`, `RESOLVED`
     * 
     */
    @Import(name="issuetheme", required=true)
    private Output<String> issuetheme;

    /**
     * @return Possible Values: `ERROR`, `INFO`, `RESOLVED`
     * 
     */
    public Output<String> issuetheme() {
        return this.issuetheme;
    }

    /**
     * Possible Values: `GITHUB`, `GITLAB`, `JIRA`, `JIRA_CLOUD`, `JIRA_ON_PREMISE`, `SERVICENOW`
     * 
     */
    @Import(name="issuetrackersystem", required=true)
    private Output<String> issuetrackersystem;

    /**
     * @return Possible Values: `GITHUB`, `GITLAB`, `JIRA`, `JIRA_CLOUD`, `JIRA_ON_PREMISE`, `SERVICENOW`
     * 
     */
    public Output<String> issuetrackersystem() {
        return this.issuetrackersystem;
    }

    /**
     * Password
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return Password
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * Token
     * 
     */
    @Import(name="token")
    private @Nullable Output<String> token;

    /**
     * @return Token
     * 
     */
    public Optional<Output<String>> token() {
        return Optional.ofNullable(this.token);
    }

    /**
     * For Jira, use the base URL (for example, https://jira.yourcompany.com); for GitHub, use the repository URL (for example, https://github.com/org/repo); for GitLab, use the specific project API for a single project (for example, https://gitlab.com/api/v4/projects/:projectId), and the specific group API for a multiple projects (for example, https://gitlab.com/api/v4/groups/:groupId); for ServiceNow, use your company instance URL (for example, https://yourinstance.service-now.com/)
     * 
     */
    @Import(name="url", required=true)
    private Output<String> url;

    /**
     * @return For Jira, use the base URL (for example, https://jira.yourcompany.com); for GitHub, use the repository URL (for example, https://github.com/org/repo); for GitLab, use the specific project API for a single project (for example, https://gitlab.com/api/v4/projects/:projectId), and the specific group API for a multiple projects (for example, https://gitlab.com/api/v4/groups/:groupId); for ServiceNow, use your company instance URL (for example, https://yourinstance.service-now.com/)
     * 
     */
    public Output<String> url() {
        return this.url;
    }

    /**
     * Username
     * 
     */
    @Import(name="username", required=true)
    private Output<String> username;

    /**
     * @return Username
     * 
     */
    public Output<String> username() {
        return this.username;
    }

    private IssueTrackingArgs() {}

    private IssueTrackingArgs(IssueTrackingArgs $) {
        this.enabled = $.enabled;
        this.issuelabel = $.issuelabel;
        this.issuequery = $.issuequery;
        this.issuetheme = $.issuetheme;
        this.issuetrackersystem = $.issuetrackersystem;
        this.password = $.password;
        this.token = $.token;
        this.url = $.url;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IssueTrackingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IssueTrackingArgs $;

        public Builder() {
            $ = new IssueTrackingArgs();
        }

        public Builder(IssueTrackingArgs defaults) {
            $ = new IssueTrackingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled This setting is enabled (`true`) or disabled (`false`)
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
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
         * @param issuelabel Set a label to identify these issues, for example, `release_blocker` or `non-critical`
         * 
         * @return builder
         * 
         */
        public Builder issuelabel(Output<String> issuelabel) {
            $.issuelabel = issuelabel;
            return this;
        }

        /**
         * @param issuelabel Set a label to identify these issues, for example, `release_blocker` or `non-critical`
         * 
         * @return builder
         * 
         */
        public Builder issuelabel(String issuelabel) {
            return issuelabel(Output.of(issuelabel));
        }

        /**
         * @param issuequery You can use the following placeholders to automatically insert values from the **Release monitoring** page in your query: `{NAME}`, `{VERSION}`, `{STAGE}`, `{PRODUCT}`.
         * 
         * @return builder
         * 
         */
        public Builder issuequery(Output<String> issuequery) {
            $.issuequery = issuequery;
            return this;
        }

        /**
         * @param issuequery You can use the following placeholders to automatically insert values from the **Release monitoring** page in your query: `{NAME}`, `{VERSION}`, `{STAGE}`, `{PRODUCT}`.
         * 
         * @return builder
         * 
         */
        public Builder issuequery(String issuequery) {
            return issuequery(Output.of(issuequery));
        }

        /**
         * @param issuetheme Possible Values: `ERROR`, `INFO`, `RESOLVED`
         * 
         * @return builder
         * 
         */
        public Builder issuetheme(Output<String> issuetheme) {
            $.issuetheme = issuetheme;
            return this;
        }

        /**
         * @param issuetheme Possible Values: `ERROR`, `INFO`, `RESOLVED`
         * 
         * @return builder
         * 
         */
        public Builder issuetheme(String issuetheme) {
            return issuetheme(Output.of(issuetheme));
        }

        /**
         * @param issuetrackersystem Possible Values: `GITHUB`, `GITLAB`, `JIRA`, `JIRA_CLOUD`, `JIRA_ON_PREMISE`, `SERVICENOW`
         * 
         * @return builder
         * 
         */
        public Builder issuetrackersystem(Output<String> issuetrackersystem) {
            $.issuetrackersystem = issuetrackersystem;
            return this;
        }

        /**
         * @param issuetrackersystem Possible Values: `GITHUB`, `GITLAB`, `JIRA`, `JIRA_CLOUD`, `JIRA_ON_PREMISE`, `SERVICENOW`
         * 
         * @return builder
         * 
         */
        public Builder issuetrackersystem(String issuetrackersystem) {
            return issuetrackersystem(Output.of(issuetrackersystem));
        }

        /**
         * @param password Password
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password Password
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param token Token
         * 
         * @return builder
         * 
         */
        public Builder token(@Nullable Output<String> token) {
            $.token = token;
            return this;
        }

        /**
         * @param token Token
         * 
         * @return builder
         * 
         */
        public Builder token(String token) {
            return token(Output.of(token));
        }

        /**
         * @param url For Jira, use the base URL (for example, https://jira.yourcompany.com); for GitHub, use the repository URL (for example, https://github.com/org/repo); for GitLab, use the specific project API for a single project (for example, https://gitlab.com/api/v4/projects/:projectId), and the specific group API for a multiple projects (for example, https://gitlab.com/api/v4/groups/:groupId); for ServiceNow, use your company instance URL (for example, https://yourinstance.service-now.com/)
         * 
         * @return builder
         * 
         */
        public Builder url(Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url For Jira, use the base URL (for example, https://jira.yourcompany.com); for GitHub, use the repository URL (for example, https://github.com/org/repo); for GitLab, use the specific project API for a single project (for example, https://gitlab.com/api/v4/projects/:projectId), and the specific group API for a multiple projects (for example, https://gitlab.com/api/v4/groups/:groupId); for ServiceNow, use your company instance URL (for example, https://yourinstance.service-now.com/)
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        /**
         * @param username Username
         * 
         * @return builder
         * 
         */
        public Builder username(Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username Username
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public IssueTrackingArgs build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            $.issuelabel = Objects.requireNonNull($.issuelabel, "expected parameter 'issuelabel' to be non-null");
            $.issuequery = Objects.requireNonNull($.issuequery, "expected parameter 'issuequery' to be non-null");
            $.issuetheme = Objects.requireNonNull($.issuetheme, "expected parameter 'issuetheme' to be non-null");
            $.issuetrackersystem = Objects.requireNonNull($.issuetrackersystem, "expected parameter 'issuetrackersystem' to be non-null");
            $.url = Objects.requireNonNull($.url, "expected parameter 'url' to be non-null");
            $.username = Objects.requireNonNull($.username, "expected parameter 'username' to be non-null");
            return $;
        }
    }

}
