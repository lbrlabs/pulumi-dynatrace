// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Dynatrace.Outputs
{

    [OutputType]
    public sealed class ServiceAnomaliesV2FailureRateFixedDetection
    {
        public readonly Outputs.ServiceAnomaliesV2FailureRateFixedDetectionOverAlertingProtection OverAlertingProtection;
        public readonly string Sensitivity;
        public readonly double Threshold;

        [OutputConstructor]
        private ServiceAnomaliesV2FailureRateFixedDetection(
            Outputs.ServiceAnomaliesV2FailureRateFixedDetectionOverAlertingProtection overAlertingProtection,

            string sensitivity,

            double threshold)
        {
            OverAlertingProtection = overAlertingProtection;
            Sensitivity = sensitivity;
            Threshold = threshold;
        }
    }
}
