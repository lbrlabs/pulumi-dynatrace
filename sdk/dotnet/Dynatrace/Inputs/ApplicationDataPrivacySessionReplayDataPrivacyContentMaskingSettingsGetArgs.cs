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

    public sealed class ApplicationDataPrivacySessionReplayDataPrivacyContentMaskingSettingsGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("playback", required: true)]
        public Input<Inputs.ApplicationDataPrivacySessionReplayDataPrivacyContentMaskingSettingsPlaybackGetArgs> Playback { get; set; } = null!;

        [Input("recording", required: true)]
        public Input<Inputs.ApplicationDataPrivacySessionReplayDataPrivacyContentMaskingSettingsRecordingGetArgs> Recording { get; set; } = null!;

        public ApplicationDataPrivacySessionReplayDataPrivacyContentMaskingSettingsGetArgs()
        {
        }
        public static new ApplicationDataPrivacySessionReplayDataPrivacyContentMaskingSettingsGetArgs Empty => new ApplicationDataPrivacySessionReplayDataPrivacyContentMaskingSettingsGetArgs();
    }
}
