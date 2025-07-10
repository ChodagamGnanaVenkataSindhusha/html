const accessories = {
  kitchen: {
    usage: 150,
    humidity: 70,
    internet: 10,
    temp: 22,
    items: [
      {
        title: "CHIMNEY 🧯",
        img: "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR7PRJpwU9J15YCr_m9_GCvvePFlwh7v0N3ew&s",
      },
      {
        title: "REFRIGERATOR 🧊",
        img: "https://static.thenounproject.com/png/3929162-200.png",
      },
      {
        title: "OVEN 🍽",
        img: "https://png.pngtree.com/png-vector/20190628/ourmid/pngtree-oven-icon-for-your-project-png-image_1520003.jpg",
      },
      {
        title: "EXHAUST FAN 💨",
        img: "https://media.istockphoto.com/id/2075183965/vector/fan-icon-with-shadow-on-white-background.jpg?s=612x612&w=0&k=20&c=417AIDe2FOzmIuE6W7EcNm-8EqPQRwBdwlMeYGAey0U=",
      },
      {
        title: "SMART LIGHTS 💡",
        img: "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRxZbG1Mi8ehWJsjX4DIiMHQJ5THOaSGhz4mQ&s",
      },
    ],
  },

  living: {
    usage: 213,
    humidity: 85,
    internet: 20,
    temp: 18.5,
    items: [
      {
        title: "TELEVISION 📺",
        img: "data:image/jpeg;base64,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",
      },
      {
        title: "SMART LIGHTS 💡",
        img: "https://t3.ftcdn.net/jpg/14/72/77/68/360_F_1472776890_5rn1a6ogOjwIUhkzQVe2taIoG5u0bTKp.jpg",
      },
      {
        title: "SMART DOOR 🚪",
        img: "https://cdn3d.iconscout.com/3d/premium/thumb/smart-door-lock-3d-icon-download-in-png-blend-fbx-gltf-file-formats--internet-of-things-pack-appliances-icons-6360913.png",
      },
      {
        title: "WASHING MACHINE 🧺",
        img: "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTvNYuZU7t2Be0DkhPizLYu1sV7ptyiXIkq5g&s",
      },
      {
        title: "FAN 🌀",
        img: "https://static.vecteezy.com/system/resources/previews/043/513/718/non_2x/ceiling-fan-icon-in-line-style-free-vector.jpg",
      },
      {
        title: "SPEAKERS 🔊",
        img: "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRHWEVPzKhQxCD2OsArpvxhQnJWoY8a_pBshg&s",
      },
    ],
  },

  bedroom: {
    usage: 90,
    humidity: 72,
    internet: 15,
    temp: 24,
    items: [
      {
        title: "SMART LIGHTS 💡",
        img: "https://thumbnail.imgbin.com/14/13/21/imgbin-light-computer-icons-symbol-light-1H8aFZBciuD2uiEyiaRLtJwhw_t.jpg",
      },
      {
        title: "SMART FAN 🌀",
        img: "https://www.shutterstock.com/image-vector/outline-ceiling-fan-icon-isolated-260nw-2616551283.jpg",
      },
      {
        title: "SMART AC ❄",
        img: "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTBzlnwmWMe97xIu3W30aPzhDe4_HG_lcJVdQ&s",
      },
      {
        title: "SMART CLOCK ⏰",
        img: "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSt5a2dRzgT2W_UsXl-QPnILBlUjibWX2xgkA&s",
      },
      {
        title: "WIFI ROUTER 📶",
        img: "https://img.favpng.com/14/21/10/home-icon-smarthome-icon-wifi-icon-EwZT49jD.jpg",
      },
    ],
  },

  washroom: {
    usage: 110,
    humidity: 60,
    internet: 5,
    temp: 26,
    items: [
      {
        title: "EXHAUST FAN 💨",
        img: "https://media.istockphoto.com/id/1442184252/vector/exhaust-fan-air-cooler-cpu-fan-for-computer-cooling-system-vector-icon-in-line-style-design.jpg?s=612x612&w=0&k=20&c=jmtqlqnj9gLv0tNKBqo3LYYQz0L0BpLgLsSZvBehXu8=",
      },
      {
        title: "SMART LIGHTS 💡",
        img: "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT6BhRCHZ1A_D4sPBE8DOvEsJrbYGL-5TzcDw&s",
      },
      {
        title: "SHOWER 🚿",
        img: "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRaW6-UKUsgwvYT20PQ6FXyxCkMVVxW2ZIaKQ&s",
      },
      {
        title: "GEYSER ♨",
        img: "https://cdn-icons-png.flaticon.com/512/4487/4487391.png",
      },
    ],
  },
};

export default accessories;