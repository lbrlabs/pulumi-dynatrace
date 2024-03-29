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

    public sealed class UpdateWindowsDailyRecurrenceGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("every", required: true)]
        public Input<int> Every { get; set; } = null!;

        [Input("recurrenceRange", required: true)]
        public Input<Inputs.UpdateWindowsDailyRecurrenceRecurrenceRangeGetArgs> RecurrenceRange { get; set; } = null!;

        [Input("updateTime", required: true)]
        public Input<Inputs.UpdateWindowsDailyRecurrenceUpdateTimeGetArgs> UpdateTime { get; set; } = null!;

        public UpdateWindowsDailyRecurrenceGetArgs()
        {
        }
        public static new UpdateWindowsDailyRecurrenceGetArgs Empty => new UpdateWindowsDailyRecurrenceGetArgs();
    }
}
