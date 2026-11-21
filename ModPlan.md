# Not Enough Smithing Templates 开发文档 v1.0

> 本文档可直接拿去开发。

---

# 第一部分：项目概述

## 1.1 一句话

**Cosmic Overflow 是一个科冒模组。以“锻造”为中心主题。**

## 1.2 模组ID与版本

- 模组ID：`not_enough_smithing_templates`
- 中文名：《锻造科技》
- 开发版本：NeoForge 1.21.1（首选）
- 依赖：Mantle（手册）、JEI/REI（配方查看）

## 1.3 定位声明

| 项目 | 定位 |
|---|---|
| 类型 | 科技模组 |
| 难度 | 中等，属于原版增强类 |
| 整合包 | 面向科技类、冒险类整合包 |
| 结局 | **没有结局。** |

---

# 第一部分：项目规划

## 第一步：添加锻造模板
- 向游戏的每种工具材料添加锻造模板（木、石、铁、金、钻）
- 加入皮革锻造模板（用于盔甲）
- 向游戏内的每种工具加入“土坯”（镐、斧、锄、剑、铲）
- 向游戏内的盔甲加入“土坯”（头盔、胸甲、护腿、靴子）
- 增加土坯的合成方式
- 增加锻造的合成方式
- 增加锻造模板的合成方式
- 增加锻造模板的战利品表：
    木：igloo_chest：雪屋地下室里的箱子。jungle_temple：丛林神庙里的箱子。pillager_outpost：掠夺者前哨站的箱子。shipwreck_treasure：沉船的宝箱。simple_dungeon：刷怪房里的箱子。underwater_ruin_big：海底废墟的大型建筑物的箱子。underwater_ruin_small：海底废墟的小型建筑物的箱子。village：村庄中的箱子。spawn_bonus_chest：如果打开奖励箱选项的话，新世界生成时的奖励箱。
    石：igloo_chest：雪屋地下室里的箱子。jungle_temple：丛林神庙里的箱子。pillager_outpost：掠夺者前哨站的箱子。shipwreck_treasure：沉船的宝箱。simple_dungeon：刷怪房里的箱子。underwater_ruin_big：海底废墟的大型建筑物的箱子。underwater_ruin_small：海底废墟的小型建筑物的箱子。village：村庄中的箱子。spawn_bonus_chest：如果打开奖励箱选项的话，新世界生成时的奖励箱。
    铁：abandoned_mineshaft：废弃矿井中的运输矿车。igloo_chest：雪屋地下室里的箱子。jungle_temple：丛林神庙里的箱子。pillager_outpost：掠夺者前哨站的箱子。shipwreck_treasure：沉船的宝箱。simple_dungeon：刷怪房里的箱子。underwater_ruin_big：海底废墟的大型建筑物的箱子。village：村庄中的箱子。
    金：abandoned_mineshaft：废弃矿井中的运输矿车。ancient_city：远古城市中的宝箱。buried_treasure：埋藏的宝藏。desert_pyramid：沙漠神殿的宝藏室里的箱子。stronghold_crossing：要塞储存室里的箱子。stronghold_library：要塞图书馆里的箱子。nether_bridge：下界要塞里的箱子。ruined_portal：废弃传送门的箱子。
    钻：abandoned_mineshaft：废弃矿井中的运输矿车。ancient_city：远古城市中的宝箱。buried_treasure：埋藏的宝藏。desert_pyramid：沙漠神殿的宝藏室里的箱子。stronghold_crossing：要塞储存室里的箱子。stronghold_library：要塞图书馆里的箱子。
- 绘制土坯的材质
- 绘制锻造模板的材质

## 第二步：修改原版
- 删除原版的工具、盔甲合成配方
- 修改锻造台的合成配方

## 第三步：撰写手册
- 制作游戏内模组手册