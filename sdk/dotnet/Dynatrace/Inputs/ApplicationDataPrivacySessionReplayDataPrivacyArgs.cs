// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Dynatrace.Inputs
{

    public sealed class ApplicationDataPrivacySessionReplayDataPrivacyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (Field has overlap with `dynatrace.SessionReplayWebPrivacy`) Content masking settings for Session Replay.
        /// </summary>
        [Input("contentMaskingSettings", required: true)]
        public Input<Inputs.ApplicationDataPrivacySessionReplayDataPrivacyContentMaskingSettingsArgs> ContentMaskingSettings { get; set; } = null!;

        [Input("optIn")]
        public Input<bool>? OptIn { get; set; }

        [Input("urlExclusionRules")]
        private InputList<string>? _urlExclusionRules;
        public InputList<string> UrlExclusionRules
        {
            get => _urlExclusionRules ?? (_urlExclusionRules = new InputList<string>());
            set => _urlExclusionRules = value;
        }

        public ApplicationDataPrivacySessionReplayDataPrivacyArgs()
        {
        }
        public static new ApplicationDataPrivacySessionReplayDataPrivacyArgs Empty => new ApplicationDataPrivacySessionReplayDataPrivacyArgs();
    }
}
