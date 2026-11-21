# Not Enough Smithing Templates

Let's have more smithing templates!!!!

## 项目信息

- Mod ID: `not_enough_smithing_templates`
- Minecraft: `1.21.1`
- 构建插件: `ModDevGradle`
- Java: `21`
- 许可证: `GPL-3.0`

## 构建

    ./gradlew build

Windows 使用：

    gradlew.bat build

构建产物位于 `build/libs/`。

项目需要 Java 21。首次构建会下载 Gradle、NeoForge 与 Minecraft 依赖；依赖缓存完成后可使用离线构建：

    gradlew.bat build --offline

仓库配置优先使用 BMCLAPI，并保留 NeoForge 官方仓库作为后备，避免部分地区直接访问官方仓库超时。

## 运行

    ./gradlew runClient
    ./gradlew runServer
    ./gradlew runData

首次启动需要下载 Gradle、NeoForge 与 Minecraft 依赖。
