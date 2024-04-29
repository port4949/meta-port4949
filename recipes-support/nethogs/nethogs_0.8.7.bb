Descrition = "Small 'net top' tool that groups bandwidth by process"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = "git://github.com/raboof/nethogs.git;protocol=https;branch=main \
           file://0001-Don-t-run-conninode_test.patch \
"
PV = "0.8.7"
SRCREV = "v0.8.7" 

S = "${WORKDIR}/git"

DEPENDS = "ncurses libpcap"

EXTRA_OEMAKE = "PREFIX=${prefix} CC='${CC}' CFLAGS='${CFLAGS}' DESTDIR=${D} LIBDIR=${libdir} INCLUDEDIR=${includedir} BUILD_STATIC=no"

do_install() {
        oe_runmake install
}
