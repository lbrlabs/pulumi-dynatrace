// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAlertingProfilesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAlertingProfilesArgs Empty = new GetAlertingProfilesArgs();

    @Import(name="profiles")
    private @Nullable Output<Map<String,String>> profiles;

    public Optional<Output<Map<String,String>>> profiles() {
        return Optional.ofNullable(this.profiles);
    }

    private GetAlertingProfilesArgs() {}

    private GetAlertingProfilesArgs(GetAlertingProfilesArgs $) {
        this.profiles = $.profiles;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAlertingProfilesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAlertingProfilesArgs $;

        public Builder() {
            $ = new GetAlertingProfilesArgs();
        }

        public Builder(GetAlertingProfilesArgs defaults) {
            $ = new GetAlertingProfilesArgs(Objects.requireNonNull(defaults));
        }

        public Builder profiles(@Nullable Output<Map<String,String>> profiles) {
            $.profiles = profiles;
            return this;
        }

        public Builder profiles(Map<String,String> profiles) {
            return profiles(Output.of(profiles));
        }

        public GetAlertingProfilesArgs build() {
            return $;
        }
    }

}
