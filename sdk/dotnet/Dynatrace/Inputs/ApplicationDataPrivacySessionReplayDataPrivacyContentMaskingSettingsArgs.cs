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

    public sealed class ApplicationDataPrivacySessionReplayDataPrivacyContentMaskingSettingsArgs : global::Pulumi.ResourceArgs
    {
        [Input("playback", required: true)]
        public Input<Inputs.ApplicationDataPrivacySessionReplayDataPrivacyContentMaskingSettingsPlaybackArgs> Playback { get; set; } = null!;

        [Input("recording", required: true)]
        public Input<Inputs.ApplicationDataPrivacySessionReplayDataPrivacyContentMaskingSettingsRecordingArgs> Recording { get; set; } = null!;

        public ApplicationDataPrivacySessionReplayDataPrivacyContentMaskingSettingsArgs()
        {
        }
        public static new ApplicationDataPrivacySessionReplayDataPrivacyContentMaskingSettingsArgs Empty => new ApplicationDataPrivacySessionReplayDataPrivacyContentMaskingSettingsArgs();
    }
}
