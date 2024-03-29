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
    public sealed class DataPrivacyMasking
    {
        public readonly string? IpAddressMasking;
        /// <summary>
        /// Dynatrace captures the IP addresses of your end-users to determine the regions from which they access your application. To learn more, visit [Mask IPs and GPS coordinates](https://dt-url.net/mask-end-users-ip-addresses).. Dynatrace also captures GPS data from mobile apps that provide their users with the option of sharing geolocation data. On the server side, Dynatrace captures IP addresses to enable detailed troubleshooting for Dynatrace service calls.
        /// </summary>
        public readonly bool IpAddressMaskingEnabled;
        public readonly bool PersonalDataUriMaskingEnabled;
        public readonly bool UserActionMaskingEnabled;

        [OutputConstructor]
        private DataPrivacyMasking(
            string? ipAddressMasking,

            bool ipAddressMaskingEnabled,

            bool personalDataUriMaskingEnabled,

            bool userActionMaskingEnabled)
        {
            IpAddressMasking = ipAddressMasking;
            IpAddressMaskingEnabled = ipAddressMaskingEnabled;
            PersonalDataUriMaskingEnabled = personalDataUriMaskingEnabled;
            UserActionMaskingEnabled = userActionMaskingEnabled;
        }
    }
}
