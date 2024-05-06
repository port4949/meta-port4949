DESCRIPTION = "C rewrite of munin node components"
LICENSE = "GPL-2"
LIC_FILES_CHKSUM = "file://gpl-2.0.txt;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
                    file://gpl-3.0.txt;md5=d32239bcb673463ab874e80d47fae504 \
                    "

SRC_URI = "git://github.com/munin-monitoring/munin-c.git;protocol=https;branch=master"

# Modify these as desired
PV = "0.0.16"
SRCREV = "0.0.16"

S = "${WORKDIR}/git"
# perl-native for pod2man
DEPENDS = "perl-native"


# NOTE: if this software is not capable of being built in a separate build directory
# from the source, you should replace autotools with autotools-brokensep in the
# inherit line
inherit autotools

# Specify any options you want to pass to the configure script using EXTRA_OECONF:
EXTRA_OECONF = ""

