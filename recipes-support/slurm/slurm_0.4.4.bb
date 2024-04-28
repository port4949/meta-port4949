SUMMARY = "A realtime network traffic statistic tool"
LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
                    file://COPYRIGHT;md5=305b69910aa70e84902cbf2bfbed8aae \
                   "
SRC_URI = "git://github.com/mattthias/slurm.git;protocol=https;branch=upstream"

# Modify these as desired
PV = "0.4.4"
SRCREV = "upstream/0.4.4"

S = "${WORKDIR}/git"

DEPENDS = "ncurses"
inherit meson

